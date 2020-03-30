package org.tasks.kyu6.OopTasks;

import static org.testng.AssertJUnit.assertTrue;

import org.tasks.kyu6.OopTasks.LeetspeakEncoder.Leetspeak;
import org.testng.annotations.Test;

/**
 * Created by Dell on 5/2/2017.
 */
public class TestLeetspeakEncoder {

    Leetspeak myEncoder = new Leetspeak();

    @Test
    public void simpleTest(){
        assertTrue("empty string", myEncoder.encode("").equals(""));
        assertTrue("abcdef string", myEncoder.encode("abcdef").equals("4bcd3f"));
        assertTrue("Abcdef string", myEncoder.encode("Abcdef").equals("4bcd3f"));
        assertTrue("Aaelmouk string", myEncoder.encode("Aaelmouk").equals("4431/^^\\0(_)k"));
    }
}
