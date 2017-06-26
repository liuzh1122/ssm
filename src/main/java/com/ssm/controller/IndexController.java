package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/6/26.
 */
@Controller
@RequestMapping(value = "/")
public class IndexController {

    @RequestMapping(value = {"index.htm","/"})
    public String index(){
        return "index";
    }
}
