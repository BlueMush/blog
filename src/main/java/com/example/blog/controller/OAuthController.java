package com.example.blog.controller;

import com.example.blog.model.dto.OAuthDTO;
import com.example.blog.service.OAuthService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
@AllArgsConstructor
public class OAuthController {

    private OAuthService oAuthService;

    @GetMapping("/oauth/google")
    public String googleApi() {
        return "/oauth/google";
    }

    @GetMapping("/oauth/kakao")
    public String kakaoApi() {
        return "/oauth/kakao";
    }

    @PostMapping("/kakao/token")
    public String kakaoToken(OAuthDTO oAuthDTO) {
        oAuthService.getKakaoToken(oAuthDTO);

        return null;
    }
}
