package guru.ysy.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhenrui on 2021/11/9 09:21
 */
@RequestMapping("/vets")
@Controller
public class VetController {

    @RequestMapping({ "","/", "/index", "/index.html"})
    public String listVets(){

        return "vets/index";
    }
}
