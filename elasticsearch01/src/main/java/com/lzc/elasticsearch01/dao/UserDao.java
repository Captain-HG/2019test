package com.lzc.elasticsearch01.dao;

import com.lzc.elasticsearch01.model.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

/**
 * @AUTHOR HG-captain
 * @Data 2019/7/1
 * @Description 连接elasticserrch的接口
 */
@Component
public interface UserDao extends ElasticsearchRepository<User,String> {

}
