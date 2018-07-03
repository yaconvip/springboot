package vip.yacon.bootdemo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("hello")
public class HelloController {

    @RequestMapping("sayHello")
    public String sayHello() {
        System.out.println("=====This is sayHello() method !===我是中文==");
        return "你好，Spring Boot !";
    }
}
