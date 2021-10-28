package guru.ysy.sfgpetclinic.services;

import org.springframework.stereotype.Service;

/**
 * Created by zhenrui on 2021/10/28 14:30
 */
@Service
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
