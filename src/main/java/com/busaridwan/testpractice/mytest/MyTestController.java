package com.busaridwan.testpractice.mytest;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/test")
//@RequiredArgsConstructor
public class MyTestController {
//    private final MyTestService service;

    @GetMapping
    public List<MyTest> getAllTest(){
        return  List.of(
                new MyTest(1, "Ridwan", "ridwan@example.com"),
                new MyTest(2, "Busari", "busari@example.com"),
                new MyTest(3, "Muhammed", "muhammed@example.com")
        );
//        return service.getAll();
    }
}
