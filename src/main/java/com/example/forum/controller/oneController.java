package com.example.forum.controller;

import com.example.forum.bean.user;
import com.example.forum.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;

@Controller
public class oneController {

    @Autowired
    loginService loginService;


    @GetMapping("/one")
    public String one(Model model){
        return "index";
    }

    @GetMapping("/login")
    public String two(){
        return "login";
    }

    @PostMapping("/loginOK")
    public String login(@PathParam("name") String name , @PathParam("password") String password, HttpSession session){
        user user=loginService.login(name,password);
        System.out.println(user);
        session.setAttribute("user",user);
        return "index";
    }
}
