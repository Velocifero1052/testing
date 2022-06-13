package com.example.testing;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ConditionalTest {

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void someWindowsTest(){
        assertTrue(true);
    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void someJava17Test(){
        assertTrue(true);
    }

    @Test
    @EnabledForJreRange(min=JRE.JAVA_11, max=JRE.JAVA_17)
    void someJreRangeTest(){
        assertTrue(true);
    }

    @Test
    @Disabled("reason: dont run until we fix JIRA #3214")
    void someDisabledTest(){
        assertTrue(true);
    }

}
