package kyu7;

import static org.testng.Assert.assertEquals;

import java.util.UUID;
import org.testng.annotations.Test;


/**
 * Created by vboliuk on 29.12.2016.
 */
public class TestSpacify {

    @Test
    public void basicTest() {
        assertEquals("h e l l o   w o r l d",Spacify.spacify("hello world"));
        assertEquals("1 2 3 4 5", Spacify.spacify("12345"));
    }

    @Test
    public void randomTest() {
        for (int i = 0; i < 100; i++) {
            String rstring = UUID.randomUUID().toString();
            assertEquals(rstring.replaceAll(".(?!$)","$0 "),Spacify.spacify(rstring));
        }
    }
}
