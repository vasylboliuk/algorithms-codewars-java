package testsKuy7;
import kyu7.HowManyTimesDoesItContain;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.util.Random;


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

    /*@Test
    public void randomTests() {
        for(int i=0;i<100;i++){
            char randomChar = (char)(random.nextInt(95) + 32);
            String randomString = generateRandomString();
            assertEquals( HowManyTimesDoesItContain.stringCounter(randomString,randomChar) , solution(randomString,randomChar) );
        }
    }

    private static String generateRandomString(){
        StringBuffer sb = new StringBuffer();
        int len = random.nextInt(151) + 50;
        for(int i=0;i<len;i++)
            sb.append( (char)(random.nextInt(95) + 32) );
        return sb.toString();
    }

    private static int solution(String inputS, char charS){
        return inputS.chars().map(c -> c==charS ? 1:0).sum();
    }*/
}
