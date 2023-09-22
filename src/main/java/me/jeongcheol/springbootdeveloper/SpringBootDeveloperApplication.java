package me.jeongcheol.springbootdeveloper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDeveloperApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDeveloperApplication.class, args);  // 첫번째 인수는 스프링 부트 3 애플리케이션의 메인 클래스로 사용할 클래스, 두 번째 인수는 커맨드 라인의 인수들을 전달한다.
    }
}
