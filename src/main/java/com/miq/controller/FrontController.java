package com.miq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FrontController {

    @Autowired
    RestTemplate  template;

    @GetMapping("/get")
    public String get(){
      return  template.getForEntity("http://localhost:8080/get2",String.class).getBody();
    }

    @GetMapping("/get2")
    public String get2(){
        return "hello GET 2";
    }
}
