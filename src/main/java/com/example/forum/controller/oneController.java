package com.example.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.websocket.server.PathParam;

@Controller
public class oneController {

    @GetMapping("/")
    public String one(Model model){
        return "index";
    }
}
