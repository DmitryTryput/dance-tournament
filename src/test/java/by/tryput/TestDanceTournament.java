package by.tryput;

import org.junit.Test;

import java.util.List;

public class TestDanceTournament {

    @Test
    public void testDanceTournament() {
        List<Integer> integers = RandomSequenceGenerator.generateRandomSequence(10);
        Dancer dancer = new Dancer(integers, "Michael Jackson");
        DanceTournament danceTournament = new DanceTournament();
        danceTournament.addNewDancer(dancer);
        danceTournament.startTournament();
        danceTournament.showResults();
    }
}
