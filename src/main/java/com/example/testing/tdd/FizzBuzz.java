package com.example.testing.tdd;

public class FizzBuzz {

    public String compute(Integer number){
        if(number % 5 == 0 && number % 3 == 0)
            return "FizzBuzz";
        else if(number % 3 == 0)
            return "Fizz";
        else if(number % 5 == 0)
            return "Buzz";
        else
            return String.valueOf(number);
    }

}
