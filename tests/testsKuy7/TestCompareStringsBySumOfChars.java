package testsKuy7;
import kyu7.CompareStringsBySumOfChars;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
/**
 * Created by vboliuk on 29.12.2016.
 */
public class TestCompareStringsBySumOfChars {

    @Test
    public void BasicTests() {
        assertEquals("'AD' vs 'BC'", true, CompareStringsBySumOfChars.compare("AD", "BC"));
        assertEquals("'AD' vs 'DD'", false, CompareStringsBySumOfChars.compare("AD", "DD"));
        assertEquals("'gf' vs 'FG'", true, CompareStringsBySumOfChars.compare("gf", "FG"));
        assertEquals("'Ad' vs 'DD'", false, CompareStringsBySumOfChars.compare("Ad", "DD"));
        assertEquals("'zz1' vs ''", true, CompareStringsBySumOfChars.compare("zz1", ""));
        assertEquals("'ZzZz' vs 'ffPFF'", true, CompareStringsBySumOfChars.compare("ZzZz", "ffPFF"));
        assertEquals("'kl' vs 'lz'", false, CompareStringsBySumOfChars.compare("kl", "lz"));
        assertEquals("'[null]' vs ''", true, CompareStringsBySumOfChars.compare(null, ""));
        assertEquals("'!!' vs '7476'", true, CompareStringsBySumOfChars.compare("!!", "7476"));
        assertEquals("'##' vs '1176'", true, CompareStringsBySumOfChars.compare("##", "1176"));
    }

    @Test
    public void RandomTests() {
        for(int i=0; i < 40; i++)
        {
            char letter1 = (char)(Math.random() * 26 + 65);
            char letter2 = '1';

            do
            {
                letter2 = (char)(Math.random() * 26 + 65);
            }
            while(letter1 == letter2);

            if(Math.random() < 0.5)
            {
                assertEquals(true, CompareStringsBySumOfChars.compare(new String(new char[5]).replace('\0',letter1).toUpperCase() + letter2, letter2 + new String(new char[5]).replace('\0',letter1).toLowerCase()));
            }
            if(Math.random() < 0.5)
            {
                assertEquals(false, CompareStringsBySumOfChars.compare(new String(new char[4]).replace('\0', letter1).toUpperCase() + letter2 + letter2, letter2 + new String(new char[4]).replace('\0', letter1).toLowerCase()));
            }
        }
    }
}
