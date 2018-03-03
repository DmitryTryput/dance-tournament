package by.tryput;

import org.junit.Test;

import java.util.List;

public class TestDancer {

    @Test
    public void testDancer() {
        List<Integer> integers = RandomSequenceGenerator.generateRandomSequence(10);
        Dancer dancer = new Dancer(integers, "Michael Jackson");
        dancer.dance();
        System.out.println(integers);
        System.out.println(dancer.getResult());
    }
}
