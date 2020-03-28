package kyu7;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Dell on 12/27/2016.
 */
public class TestHelpSuzukiCompleteChores {



    @Test()
    public void TestHelpSuzukiCompleteChores() {
        System.out.println("****** Basic Tests ******");
        Assert.assertEquals(new int[]{7, 8, 8, 10, 10, 11}, HelpSuzukiCompleteHisChores.choreAssignments(new int[]{1, 5, 2, 8, 4, 9, 6, 4, 2, 2, 2, 9}));
    }
}
