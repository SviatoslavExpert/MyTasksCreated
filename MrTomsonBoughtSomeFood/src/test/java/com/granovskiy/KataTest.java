package com.granovskiy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    private Kata kata = new Kata();

    @Test
    public void testFindPThatShouldReturnSuccessfulCountingTwo() {
        int expectedResult = 2;
        int actualResult = Kata.findP(new String[]{"banana", "peas", "tomatoes", "pepper"});
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindPThatShouldReturnSuccessfulCountingZero() {
        int expectedResult = 0;
        int actualResult = Kata.findP(new String[]{"banana", "apples", "tomatoes", "lemons"});
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindPThatShouldReturnSuccessfulCountingFive() {
        int expectedResult = 5;
        int actualResult = Kata.findP(new String[]
                {"papaya", "peas", "peppers", "lemons", "plums", "pomegranate"});
        assertEquals(expectedResult, actualResult);
    }
}