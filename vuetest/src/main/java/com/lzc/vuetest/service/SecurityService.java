package com.lzc.vuetest.service;

import com.lzc.vuetest.entity.Role;
import com.lzc.vuetest.entity.User;
import com.lzc.vuetest.mapper.UserMapper;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @AUTHOR HG-captain
 * @Data 2019/6/18
 * @Description
 */
@Service

public class SecurityService implements UserDetailsService {
    @Autowired
    UserMapper userMapper;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println(username);

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        User user = userMapper.findUserByName(username);
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        for (Role role : user.getRoles()) {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
//        return new org.springframework.security.core.userdetails
//                .User(user.getUserName(), passwordEncoder.encode(user.getPassword().trim()), authorities);
//    }
        user.setAuthorities(authorities);
        user.setPassword(passwordEncoder.encode(user.getPassword().trim()));
        return user;
    }
}
