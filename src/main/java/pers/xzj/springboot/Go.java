package pers.xzj.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description go
 * @Author xzj (x378042733@gmail.com)
 * @Date 2021-01-14 10:51
 * @Version 1.0.0
 */
@SpringBootApplication
@MapperScan("pers.xzj.springboot.dao")
public class Go {

    public static void main(String[] args) {
        SpringApplication.run(Go.class);
    }
}
