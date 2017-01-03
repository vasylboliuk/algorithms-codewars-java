package testsKyu6;

import kyu6.PersistentBugger;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Dell on 12/26/2016.
 */

public class TestPersistentBugger {

    @Test()
    public void BasicTests() {
        System.out.println("****** Basic Tests ******");
        Assert.assertEquals(3, PersistentBugger.persistence(39));
        Assert.assertEquals(0, PersistentBugger.persistence(4));
        Assert.assertEquals(2, PersistentBugger.persistence(25));
        Assert.assertEquals(4, PersistentBugger.persistence(999));
        Assert.assertEquals(3, PersistentBugger.persistence(444));


    }
}
