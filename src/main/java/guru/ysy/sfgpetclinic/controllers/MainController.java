package guru.ysy.sfgpetclinic.controllers;

import guru.ysy.sfgpetclinic.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by zhenrui on 2021/10/28 11:27
 */
@Controller
public class MainController {

    private final GreetingService greetingService;

    public MainController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
