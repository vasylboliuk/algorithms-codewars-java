package testsKyu7;
import kyu7.CountTheCharacters;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by vboliuk on 29.12.2016.
 */
public class TestCountTheCharacters {
    public static int charCount(String str, char c) {
        return str.replaceAll(
                String.format("[^%c%c]", Character.toUpperCase(c), Character.toLowerCase(c)), ""
        ).length();
    }

    @Test
    public void testBasic() {
        assertEquals("charCount(\"fizzbuzz\", 'z') should be 4", CountTheCharacters.charCount("fizzbuzz", 'z'), 4);
        assertEquals("charCount(\"fizzbuzz FIZZBUZZ\", 'z') should be 4", CountTheCharacters.charCount("fizzbuzz FIZZBUZZ", 'z'), 8);
        assertEquals("charCount(\"fizzbuzz FIZZBUZZ\", 'Z') should be 4", CountTheCharacters.charCount("fizzbuzz FIZZBUZZ", 'Z'), 8);
        assertEquals("empty input string should return 0", CountTheCharacters.charCount("", 'z'), 0);
        assertEquals("should return 0 if the char is not in the input string", CountTheCharacters.charCount("fizzbuzz", '!'), 0);
    }

    @Test
    public void testRandom() {
        String str = null;
        int n = 0;
        while (n < 10) {
            char[] chars = new char[((int) (Math.random()*20)) + 10];
            for (int i = 0; i < chars.length; i++) {
                chars[i] = (char) (((int) (Math.random()<0.5 ? 'a' : 'A')) + ((int) (Math.random()*26)));
            }
            str = new String(chars);
            int c = TestCountTheCharacters.charCount(str, chars[0]);
            assertEquals(String.format("charCount(\"%s\", '%c') should be %d", str, chars[0], c),
                    CountTheCharacters.charCount(str, chars[0]), c);
            n++;
        }
        assertEquals("should return 0 if the char is not in the input string", CountTheCharacters.charCount(str, '!'), 0);
    }

}
