package com.example.blog.oauth.controller;

import com.example.blog.oauth.service.OAuthService;
import com.example.blog.oauth.vo.OAuthVo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@AllArgsConstructor
public class OAuthController {

    private OAuthService oAuthService;

    @RequestMapping("/oauth/google")
    public String googleApi(){
        return "/oauth/google";
    }

    @RequestMapping("/oauth/kakao")
    public String kakaoApi(){
        return "/oauth/kakao";
    }

    @PostMapping("/kakao/token")
    public String kakaoToken(OAuthVo oAuthVo){
        oAuthService.getKakaoToken(oAuthVo);

        return null;
    }
}
