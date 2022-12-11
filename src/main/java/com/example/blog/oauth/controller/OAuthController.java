package com.example.blog.oauth.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@AllArgsConstructor
public class OAuthController {

    @RequestMapping("/oauth/google")
    public String googleApi(){
        return "/oauth/google";
    }

    @RequestMapping("/oauth/kakao")
    public String kakaoApi(){
        return "/oauth/kakao";
    }
}
