package com.example.testing.tdd;

public class FizzBuzzMain {
    public static void main(String[] args) {
        var fizzBuzz = new FizzBuzz();

        for(var i = 1; i <= 100; i++){
            System.out.println(fizzBuzz.compute(i));
        }

    }
}
