package com.kob.backend.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Torch
 * @Date: 2023/11/17 22:34
 * @Description:
 */
@RestController
@RequestMapping("/pk/")
public class BotInfoController {

    @RequestMapping("getbotinfo/")
    public String getBotInfo(){
        return "hhhhhhh";
    }
}
