package com.yyk.test.user.controller;

import com.yyk.test.user.dao.UserRepository;
import com.yyk.test.user.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller // Controller : 브라우저의 요청에 반응
@RequestMapping("/api") // /api로 들어오는 요청 중
public class UserController { // 고객의 요청에 반응하는 클래스
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/users")
    @ResponseBody
    public List<User> users() { // 응답에 의해 실행
        return userRepository.findAll();
    }

    @RequestMapping("/user") // /api/user로 들어오는 요청에 응답
    @ResponseBody
    public User user() {
        User user = new User();
        return user;
    } // return값이 브라우저에 출력
}
