package com.lzc.vuetest.respority;

import com.lzc.vuetest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRespority extends JpaRepository<User,Integer> {
    @Query(value = "select u from User u where u.uName=:#{#user.uName} and u.password=:#{#user.password}")
    List<User> selectByNameAndPassword(@Param("user") User user);
}
