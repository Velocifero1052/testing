package com.example.testing;

import com.example.testing.utils.DemoUtils;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DemoUtilsTest {

    @Test
    void someTest(){
        var utils = new DemoUtils();

        var res = utils.add(2,2);
        assertEquals(4, res);

    }


}
