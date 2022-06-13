package com.example.testing;

import com.example.testing.utils.DemoUtils;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.DisabledOnOs;

import java.sql.SQLOutput;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DemoUtilsTest {

    DemoUtils utils;

    @BeforeEach
    void init(){
        utils =  new DemoUtils();
    }

    @Test
    @Order(1)
    @DisplayName("Some test name")
    void someTest(){
        var res = utils.add(2,2);
        assertEquals(4, res);
    }

    @Test
    @Order(2)
    @DisplayName("Second test")
    void testTwo(){
        var res = utils.add(-1, 1);
        assertEquals(0, res);
    }

    @Test
    @DisplayName("Assert same test")
    void assertSameTest(){
        assertSame(utils.academy, utils.academyDuplicate);
    }

    @Test
    @DisplayName("Assert content with same method")
    void assertContent(){
        assertSame(utils.academy, "academy");
    }

    @Test
    @DisplayName("Test if first number is greater or not")
    void testGreater(){
        assertTrue(utils.isGreater(10, 9));
    }

    @Test
    @DisplayName("test not greater")
    void testNotGreater(){
        assertFalse(utils.isGreater(9, 10));
    }

    @Test
    @DisplayName("test arrays match")
    void testArraysMatch(){
        var array = new String[]{"a", "b", "c"};
        assertArrayEquals(array, utils.demoArray);
    }

    @Test
    @DisplayName("assert iterable match")
    void assertIterableLists(){
        var list = Lists.newArrayList("a", "b", "c");
        assertIterableEquals(utils.demoSet, list);
    }

    @Test
    @DisplayName("line equals")
    void assertLineEqueals(){
        var list = Lists.list("a", "b", "c");
        assertLinesMatch(list, utils.demoSet);
    }

    @Test
    @DisplayName("Test for throws and doesn't exception")
    void testForException(){
        assertThrows(Exception.class, () -> {utils.methodWithException(-1);});
        assertDoesNotThrow( () -> {utils.methodWithException(1);});
    }

    @Test
    @DisplayName("Test timout")
    void testForTimout(){
        assertTimeoutPreemptively(Duration.ofMillis(2 * 1200), () -> utils.timeException());
    }

}
