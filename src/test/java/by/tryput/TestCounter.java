package by.tryput;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class TestCounter {

    @Test
    public void testPerform() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(
                10, 8, 6, 4, 2, 6, 1, 3, 5, 7, 9
        ));
        assertThat(PerformedElementsCounter.countElements(list), equalTo(60));
    }

    @Test
    public void testLoop() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(
                2, 1, 1
        ));
        assertThat(PerformedElementsCounter.countElements(list), equalTo(-1));
    }

    @Test
    public void testBasic() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(
                2, 0, 7
        ));
        assertThat(PerformedElementsCounter.countElements(list), equalTo(4));
    }
}
