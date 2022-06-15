package com.example.testing;

import com.example.testing.config.SomeConfig;
import com.example.testing.service.SomeService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ApplicationExampleTest {

    private final SomeConfig someConfig;
    private final SomeService someService;

    @Autowired
    public ApplicationExampleTest(SomeConfig someConfig, SomeService someService){
        this.someConfig = someConfig;
        this.someService = someService;
    }

    @Test
    void exampleTest() {
        System.out.println(someConfig.someName);
        someService.someMethod();
        System.out.println("omg");
    }

}
