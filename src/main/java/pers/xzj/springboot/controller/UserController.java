package pers.xzj.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pers.xzj.springboot.dao.UserMapper;
import pers.xzj.springboot.pojo.User;

import java.util.List;

/**
 * @Description controller
 * @Author xzj (x378042733@gmail.com)
 * @Date 2021-01-14 10:55
 * @Version 1.0.0
 */
@RestController
public class UserController {


    @Autowired
    private UserMapper userMapper;

    @GetMapping("/find/{id}")
    public User findUser(@PathVariable("id") Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody User user) {
        userMapper.insert(user);
    }

    @PostMapping("/saveAll")
    public void saveAll(@RequestBody List<User> users) {
        userMapper.batchInsert(users);
    }
}
