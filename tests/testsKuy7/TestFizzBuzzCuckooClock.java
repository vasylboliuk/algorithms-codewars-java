package testsKuy7;

import kyu7.FizzBuzzCuckooClock;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by vboliuk on 29.12.2016.
 */
public class TestFizzBuzzCuckooClock {

    @Test
    public void TestFizzBuzzCuckooClock() {
        System.out.println("****** Basic Tests ******");
        Assert.assertEquals("tick", FizzBuzzCuckooClock.fizzBuzzCuckooClock("13:34"));
        Assert.assertEquals("Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo", FizzBuzzCuckooClock.fizzBuzzCuckooClock("21:00"));
        Assert.assertEquals("Fizz Buzz", FizzBuzzCuckooClock.fizzBuzzCuckooClock("11:15"));
        Assert.assertEquals("Fizz", FizzBuzzCuckooClock.fizzBuzzCuckooClock("03:03"));
        Assert.assertEquals("Cuckoo", FizzBuzzCuckooClock.fizzBuzzCuckooClock("14:30"));
        Assert.assertEquals("Buzz", FizzBuzzCuckooClock.fizzBuzzCuckooClock("08:55"));
        Assert.assertEquals("Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo", FizzBuzzCuckooClock.fizzBuzzCuckooClock("00:00"));
        Assert.assertEquals("Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo", FizzBuzzCuckooClock.fizzBuzzCuckooClock("12:00"));
    }
}
