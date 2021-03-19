package pers.xzj.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pers.xzj.springboot.anno.Anno;
import pers.xzj.springboot.dao.UserMapper;
import pers.xzj.springboot.pojo.User;
import pers.xzj.springboot.utils.Pager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


    @Anno
    @GetMapping("/page/{page}/{size}")
    public Pager<User> findByPager(@PathVariable("page") int page, @PathVariable("size") int size) {
        Map<String, Object> params = new HashMap<>();
        params.put("page", (page - 1) * size);
        params.put("size", size);
        List<User> list = userMapper.findByPager(params);
        Pager<User> pager = new Pager<>();
        pager.setPage(page);
        pager.setSize(size);
        pager.setRows(list);
        pager.setTotal(userMapper.count());
        return pager;
    }
}
