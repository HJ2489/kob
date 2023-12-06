package com.kob.backend.controller.pk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: Torch
 * @Date: 2023/11/17 22:24
 * @Description:
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "pk/index.html";
    }
}
