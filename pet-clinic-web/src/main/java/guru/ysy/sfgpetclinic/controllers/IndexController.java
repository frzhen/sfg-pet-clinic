package guru.ysy.sfgpetclinic.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhenrui on 2021/11/7 17:54
 */
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String index(){

        return "index";
    }
}
