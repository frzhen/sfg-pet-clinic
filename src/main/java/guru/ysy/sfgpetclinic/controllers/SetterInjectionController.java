package guru.ysy.sfgpetclinic.controllers;

import guru.ysy.sfgpetclinic.services.GreetingService;

/**
 * Created by zhenrui on 2021/10/28 12:55
 */
public class SetterInjectionController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
