package kyu7;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.testng.annotations.Test;

public class TestAllInclusive {

    @Test
    public void test() {
        System.out.println("Fixed Tests containAllRots");
        assertThat(AllInclusive.containAllRots("", Arrays.asList())).isTrue();


        List<String> a = Arrays.asList("bsjq", "qbsj");
        assertThat(AllInclusive.containAllRots("", a)).isTrue();

        a = Arrays.asList("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs");
        assertThat(AllInclusive.containAllRots("bsjq", a)).isTrue();

        a = Arrays.asList("TzYxlgfnhf", "yqVAuoLjMLy", "BhRXjYA", "YABhRXj", "hRXjYAB", "jYABhRX", "XjYABhR", "ABhRXjY");
        assertThat(AllInclusive.containAllRots("XjYABhR", a)).isFalse();
    }
}
