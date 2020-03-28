package kyu7;


import static org.testng.Assert.assertEquals;

import java.util.Random;
import org.testng.annotations.Test;


/**
 * Created by vboliuk on 29.12.2016.
 */
public class TestHowManyTimesDoesItContain {
    private static Random random = new Random();

    @Test
    public void fixedTests() {
        assertEquals(HowManyTimesDoesItContain.stringCounter("Hello World",'o'), 2);
        assertEquals(HowManyTimesDoesItContain.stringCounter("Wait isn't it supposed to be cynical?",'i'), 4);
        assertEquals(HowManyTimesDoesItContain.stringCounter("I'm gona be the best code warrior ever dad",'r'), 4);
        assertEquals(HowManyTimesDoesItContain.stringCounter("Do you like Harry Potter?",'?'), 1);
        assertEquals(HowManyTimesDoesItContain.stringCounter("Was pepe a mistake?",'!'), 0);
    }


}
