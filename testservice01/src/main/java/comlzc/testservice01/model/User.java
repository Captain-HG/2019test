package comlzc.testservice01.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @AUTHOR HG-captain
 * @Data 2019/6/10
 * @Description
 */
@Table
@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uId;
    @Column
    private String uName;
    @Column
    private String password;
}
