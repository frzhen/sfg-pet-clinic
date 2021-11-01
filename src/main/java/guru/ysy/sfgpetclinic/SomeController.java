package guru.ysy.sfgpetclinic;

/**
 * Created by zhenrui on 2021/11/1 21:26
 */
public class SomeController {
    private final MyService myService;

    public SomeController(MyService myService) {
        this.myService = myService;
    }
}
