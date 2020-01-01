package com.yong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MessageController {

    @RequestMapping("/message/go")
    public String goTest(){
        return "reach";
    }

    @RequestMapping("/message/detail/data=(username)")
    public String goDetail(@PathVariable("username") String data, Model model){
        model.addAttribute("data", data);

        return "detail";
    }
}
