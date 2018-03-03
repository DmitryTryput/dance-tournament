package by.tryput;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class TestDanceFloor {

    @Test
    public void testSequenceCreation() {
        List<Integer> sequence = RandomSequenceGenerator.generateRandomSequence(10);
        assertThat(sequence.isEmpty(), equalTo(false));
    }

    @Test
    public void testSequenceUnique() {
        List<Integer> firstSequence = RandomSequenceGenerator.generateRandomSequence(10);
        List<Integer> secondSequence = RandomSequenceGenerator.generateRandomSequence(10);
        assertThat(firstSequence.containsAll(secondSequence), equalTo(false));
    }
}
