package org.tasks.kyu6;


import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

/**
 * Created by Dell on 12/31/2016.
 */
public class TestWriteNumberInExpandedForm {

    @Test
    public void testSomething() {
        assertThat("70000 + 300 + 4").isEqualTo(WriteNumberInExpandedForm.expandedForm(70304));
        assertThat("40 + 2").isEqualTo(WriteNumberInExpandedForm.expandedForm(42));
        assertThat("10 + 2").isEqualTo(WriteNumberInExpandedForm.expandedForm(12));
        assertThat("900000").isEqualTo(WriteNumberInExpandedForm.expandedForm(900000));
    }
}
