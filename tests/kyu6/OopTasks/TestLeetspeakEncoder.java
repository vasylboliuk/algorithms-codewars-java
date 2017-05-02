package kyu6.OopTasks;

import kyu7.OopTasks.InteractiveDictionary.Dictionary;
import kyu7.OopTasks.LeetspeakEncoder.Leetspeak;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

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
