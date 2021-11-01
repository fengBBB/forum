package com.example.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.websocket.server.PathParam;

@Controller
public class oneController {

    @GetMapping("/one")
    public String one(@PathParam("name") String name , Model model){
        return "ONE";
    }
}
