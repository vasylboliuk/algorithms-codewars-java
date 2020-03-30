package org.tasks.kyu7.OopTasks;

import static org.testng.Assert.assertEquals;

import org.tasks.kyu7.OopTasks.InteractiveDictionary.Dictionary;
import org.testng.annotations.Test;


/**
 * Created by Dell on 4/30/2017.
 */
public class TestInteractiveDictionary {

    @Test
    public void test() {
        Dictionary dict = new Dictionary();
        dict.newEntry("Apple", "A fruit that grows on trees");
        dict.newEntry("","");
        dict.newEntry("Hi","");

        assertEquals(dict.look("Apple"), "A fruit that grows on trees");
        assertEquals(dict.look("Banana"), "Cant find entry for Banana");
        assertEquals(dict.look(""), "Cant find entry for ");
        assertEquals(dict.look("Hi"), "");

    }
}
