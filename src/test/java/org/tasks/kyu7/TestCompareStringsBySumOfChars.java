package org.tasks.kyu7;


import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class TestCompareStringsBySumOfChars {

    @Test
    public void BasicTests() {

        assertThat(CompareStringsBySumOfChars.compare("AD", "BC")).isTrue();
        assertThat(CompareStringsBySumOfChars.compare("AD", "DD")).isFalse();
        assertThat(CompareStringsBySumOfChars.compare("gf", "FG")).isTrue();
        assertThat(CompareStringsBySumOfChars.compare("Ad", "DD")).isFalse();
        assertThat(CompareStringsBySumOfChars.compare("zz1", "")).isFalse();
        assertThat(CompareStringsBySumOfChars.compare("ZzZz", "ffPFF")).isTrue();
        assertThat(CompareStringsBySumOfChars.compare("kl", "lz")).isFalse();
        assertThat(CompareStringsBySumOfChars.compare(null, "")).isTrue();
        assertThat(CompareStringsBySumOfChars.compare("!!", "7476")).isTrue();
        assertThat(CompareStringsBySumOfChars.compare("##", "1176")).isTrue();
    }

}
