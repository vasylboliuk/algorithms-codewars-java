package kyu8;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class TestCodeWarsLetterInString {

    @Test
    public void test_count_letter_in_string() {
        assertThat(CodeWarsLetterInString.strCount("Hello", 'o')).isEqualTo(1);
        assertThat(CodeWarsLetterInString.strCount("Hello", 'l')).isEqualTo(2);
        assertThat(CodeWarsLetterInString.strCount("",'z')).isEqualTo(0);
    }

}
