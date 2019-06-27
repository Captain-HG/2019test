package com.lzc.vuetest.security;

import com.alibaba.fastjson.JSON;
import com.lzc.vuetest.entity.User;

import com.lzc.vuetest.utils.JwtTokenUtil;
import com.lzc.vuetest.utils.ResultVoUtil;
import com.lzc.vuetest.utils.TokenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.token.TokenService;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

/**
 * @author: zzx
 * @date: 2018/10/15 16:12
 * @description: 用户登录成功时返回给前端的数据
 */
@Component
public class AjaxAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    @Autowired
    TokenUtils tokenUtils;
    /**
     * //有效期
     */
    @Value("${jwt.expiration}")
    private Long expiration;
    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {

        //获取登录的user信息
        User user = (User) authentication.getPrincipal();
        //生成token
        String token = tokenUtils.generateToken(user);
        //存到redis中
        tokenUtils.setExpire(token,user.getUsername(),expiration+100000);
        HashMap<Object, Object> map = new HashMap<>();
        map.put("token", token);
        // 配置返回响应为json格式的数据
        httpServletResponse.setCharacterEncoding("UTF-8");
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        httpServletResponse.setContentType("application/json;charset=UTF-8");
        httpServletResponse.getWriter().write(JSON.toJSONString(ResultVoUtil.success(map)));
        httpServletResponse.getWriter().flush();
    }
}
