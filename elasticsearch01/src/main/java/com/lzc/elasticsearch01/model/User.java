package com.lzc.elasticsearch01.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * @AUTHOR HG-captain
 * @Data 2019/7/1
 * @Description user文档
 */
@Document(indexName = "qwe", type = "users")
@Data
public class User implements Serializable {
    @Id
    private String id;
    /** 指定字段存储类型*/
    @Field(type = FieldType.Text)
    private String name;
    @Field
    private String password;
}
