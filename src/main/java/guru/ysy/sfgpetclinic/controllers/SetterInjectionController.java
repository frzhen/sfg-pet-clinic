package guru.ysy.sfgpetclinic.controllers;

import guru.ysy.sfgpetclinic.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by zhenrui on 2021/10/28 12:55
 */
@Controller
public class SetterInjectionController {

    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}