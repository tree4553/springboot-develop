package me.jeongcheol.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // 라우터 역할을 하는 애너테이션
// 라우터란 HTTP 요청과 메서드를 연결하는 장치이다.
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping("/test")
    public List<Member> getAllMembers() {
        List<Member> members = testService.getAllMembers();
        return members;
    }




}
