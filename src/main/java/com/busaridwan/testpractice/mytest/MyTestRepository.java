package com.busaridwan.testpractice.mytest;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MyTestRepository {
    static List<MyTest> records =
            List.of(
                    new MyTest(1, "Ridwan", "ridwan@example.com"),
                    new MyTest(2, "Busari", "busari@example.com"),
                    new MyTest(3, "Muhammed", "muhammed@example.com")
            );

    public List<MyTest> getAll(){
        return records;
    }
}
