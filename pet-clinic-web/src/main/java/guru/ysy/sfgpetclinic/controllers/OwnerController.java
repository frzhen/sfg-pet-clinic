package guru.ysy.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhenrui on 2021/11/9 09:31
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({ "","/", "/index", "/index.html"})
    public String listOwners() {
        return "owners/index";
    }
}