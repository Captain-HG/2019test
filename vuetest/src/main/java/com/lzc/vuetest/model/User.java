package com.lzc.vuetest.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @AUTHOR HG-captain
 * @Data 2019/6/5
 * @Description 用户表
 */
@Table
@Entity
@Data
public class User {
    @Id
    private Integer id;
    @Column
    private String uName;
    @Column
    private String password;
}
