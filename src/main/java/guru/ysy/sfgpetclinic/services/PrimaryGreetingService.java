package guru.ysy.sfgpetclinic.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by zhenrui on 2021/10/28 20:19
 */
@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - From the PRIMARY Bean";
    }
}
