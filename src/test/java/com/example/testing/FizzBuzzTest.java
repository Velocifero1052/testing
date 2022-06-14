package com.example.testing;

import com.example.testing.tdd.FizzBuzz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @BeforeEach
    void initFizzBuzz(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    @DisplayName("Fizz Buzz test")
    void testFizzBuzz(){
        assertEquals("Fizz", fizzBuzz.compute(3));
        assertEquals("Buzz", fizzBuzz.compute(5));
        assertEquals("FizzBuzz", fizzBuzz.compute(45));
        assertEquals("4", fizzBuzz.compute(4));
    }

    @ParameterizedTest
    @CsvSource({
            "1,1",
            "2,2",
            "3,Fizz",
            "4,4",
            "5,Buzz",
            "6,Fizz",
            "7,7",
            "8,8",
            "9,Fizz",
            "10,Buzz",
            "15,FizzBuzz"
    })
    @DisplayName("parametrized test")
    void testWithParameters(int input, String expected){
        assertEquals(expected, fizzBuzz.compute(input));
    }

    @DisplayName("test from file")
    @CsvFileSource(resources = "/fizzbuzz_test.csv")
    @ParameterizedTest(name = "value={0}, expected={1}")
    void testFromFile(int value, String expected){
        assertEquals(expected, fizzBuzz.compute(value));
    }

}
