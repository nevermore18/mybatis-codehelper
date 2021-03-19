package pers.xzj.springboot.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pers.xzj.springboot.controller.UserController;

/**
 * @Description
 * @Author xzj (x378042733@gmail.com)
 * @Date 2021-03-19 15:34
 * @Version 1.0.0
 */
@Component
public class Scheduled {
    @Autowired
    private UserController userController;

    @org.springframework.scheduling.annotation.Scheduled(cron = "0,15,30,45 * * * * ?")
    public void pushDataScheduled() {
        userController.findByPager(1,2);
    }
}
