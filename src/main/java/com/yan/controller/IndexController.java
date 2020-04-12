package com.yan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: yan
 * @Date: 2020/4/12 11:13
 * @Description: com.yan.controller
 * @version: 1.0
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "/index";
    }
}
