package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AreaOfATriangleTest {

    static Logger logger = LoggerFactory.getLogger(AreaOfATriangleTest.class);

    @Test
    public void areaOfATriangleTest() throws MySideOfTriangleException, MyFigureNotTriangleException {
        AreaOfATriangle areaOfATriangle = new AreaOfATriangle();


        Assertions.assertEquals(6.49519052838329, areaOfATriangle.countTriangleArea(3, 5, 7));
        Assertions.assertThrows(MySideOfTriangleException.class, () -> areaOfATriangle.countTriangleArea(-3, 5, 7));
        Assertions.assertThrows(MyFigureNotTriangleException.class, () -> areaOfATriangle.countTriangleArea(1, 5, 7));
    }
}


