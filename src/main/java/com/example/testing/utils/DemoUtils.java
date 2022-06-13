package com.example.testing.utils;

import java.util.List;
import java.util.Set;

public class DemoUtils {

    public String academy = "academy";
    public String academyDuplicate = academy;

    public String[] demoArray = {"a", "b", "c"};

    public List<String> demoSet = List.of("a", "b", "c");

    public Integer add(Integer a, Integer b){
        return a + b;
    }

    public Boolean isGreater(Integer a, Integer b){
        return a > b;
    }

    public String methodWithException(Integer number) throws Exception {
        if(number < 0)
            throw new Exception("number is less than zero");
        return "Number is greater than or equals to zero";
    }

    public void timeException() throws InterruptedException{
        System.out.println("Starting timeout...");
        Thread.sleep(2 * 1000);
        System.out.println("Timeout is over...");
    }



}
