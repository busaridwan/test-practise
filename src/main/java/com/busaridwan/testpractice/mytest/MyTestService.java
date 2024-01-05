package com.busaridwan.testpractice.mytest;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MyTestService {
    private final MyTestRepository repository;

    public List<MyTest> getAll(){
        return repository.getAll();
    }
}
