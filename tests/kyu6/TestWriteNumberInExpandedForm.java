package kyu6;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * Created by Dell on 12/31/2016.
 */
public class TestWriteNumberInExpandedForm {

    @Test
    public void testSomething() {
        assertEquals("70000 + 300 + 4", WriteNumberInExpandedForm.expandedForm(70304));
        assertEquals("40 + 2", WriteNumberInExpandedForm.expandedForm(42));
        assertEquals("10 + 2", WriteNumberInExpandedForm.expandedForm(12));
        assertEquals("900000", WriteNumberInExpandedForm.expandedForm(900000));
    }
}
