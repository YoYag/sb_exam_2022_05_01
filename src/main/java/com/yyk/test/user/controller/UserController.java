package com.yyk.test.user.controller;

import com.yyk.test.user.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // Controller : 브라우저의 요청에 반응
@RequestMapping("/api") // /api로 들어오는 요청 중
public class UserController { // 고객의 요청에 반응하는 클래스
    @RequestMapping("/users") // /api/users로 들어오는 요청에 응답
    @ResponseBody // return값이 브라우저에 출력
    public String users() { // 응답에 의해 실행
        return "Peaple!!!";
    }

    @RequestMapping("/user")
    @ResponseBody
    public User user() {
        User user = new User();
        return user;
    }
}
