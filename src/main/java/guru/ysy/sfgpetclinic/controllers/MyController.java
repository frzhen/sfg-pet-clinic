package guru.ysy.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by zhenrui on 2021/10/28 11:27
 */
@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Hello World!");

        return ("Hi, Folks!");
    }
}
