package by.tryput;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class TestRandomSequenceGenerator {

    @Test
    public void testSequenceCreation() {
        List<Integer> sequence = RandomSequenceGenerator.generateRandomSequence(10);
        assertThat(sequence.isEmpty(), equalTo(false));
    }
}
