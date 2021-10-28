package guru.ysy.sfgpetclinic.controllers;

import guru.ysy.sfgpetclinic.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by zhenrui on 2021/10/28 11:58
 */
@Controller
public class PropertyInjectionController {

    @Autowired
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
