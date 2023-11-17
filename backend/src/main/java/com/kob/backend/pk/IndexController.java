package com.kob.backend.pk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: Torch
 * @Date: 2023/11/17 22:24
 * @Description:
 */
@Controller
@RequestMapping("/pk/")
public class IndexController {

    @RequestMapping("index/")
    public String index(){
        return "pk/index.html";
    }
}
