package pers.xzj.springboot.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @Description log
 * @Author xzj (x378042733@gmail.com)
 * @Date 2021-03-19 14:58
 * @Version 1.0.0
 */
@Component // 将对象交给IOC容器去实例化
@Aspect // 声明当前类是一个切面
public class LogCut {

//    @Pointcut("execution (* pers.xzj.springboot.controller.*.*(..) )")
//    public void cut() {
//    }

    @Pointcut("@annotation(pers.xzj.springboot.anno.Anno)")
    public void cut() {
    }


    @Before(value = "cut()")
    public void before() {
        System.out.println("前置通知1");
    }

    @AfterReturning(value = "cut()")
    public void afterReturn() {
        System.out.println("返回通知1");
    }

    @After(value = "cut()")
    public void after() {
        System.out.println("最终通知1");
    }


    @AfterThrowing(value = "cut()", throwing = "e")
    public void afterThrow(Exception e) {
        System.out.println("异常通知1" + " 异常原因：" + e.getCause());
    }

    @Around(value = "cut()")
    public Object around(ProceedingJoinPoint pjp) {
        System.out.println("前置通知2");
        Object object = null;
        try {
            object = pjp.proceed();
            System.out.println(pjp.getTarget() + " " + pjp.getSignature());
             System.out.println("返回通知2");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("异常通知2");
        }
        System.out.println("最终通知2");
        return object;
    }
}
