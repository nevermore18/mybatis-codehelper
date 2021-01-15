package pers.xzj.springboot.pojo;

import java.util.Date;

import lombok.Data;

/**
 * @Description user
 * @Author xzj (x378042733@gmail.com)
 * @Date 2021-01-15 9:01
 * @Version 1.0.0
 */
@Data
public class User {
    private Integer id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;
}
