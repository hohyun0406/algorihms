package com.rod.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.SessionScope;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import java.util.*;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequiredArgsConstructor
public class HomeController {
    private final HomeService service;

    @RequestMapping("/")
    public String hello(){

        String s = service.test();
        return "Welcome To String Boot !";
    }

    @PostMapping("/name")
    public String name (@RequestBody Map<String,?> map){
        String name = (String)map.get("name");
        System.out.println("리퀘스트가 가져온 이름"+name);
        return ("리스판스에게 보내는 이름 : 환영합니다 " + name);
    }

}
