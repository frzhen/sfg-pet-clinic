package guru.ysy.sfgpetclinic.services;

import org.springframework.stereotype.Service;

/**
 * Created by zhenrui on 2021/10/28 11:56
 */
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
