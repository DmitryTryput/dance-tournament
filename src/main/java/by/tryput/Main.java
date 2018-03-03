package by.tryput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> sequence = Arrays.stream(args).map(Integer::valueOf).collect(Collectors.toList());
        Dancer dancer = new Dancer(sequence, "Michael Jackson");
        DanceTournament danceTournament = new DanceTournament();
        danceTournament.addNewDancer(dancer);
        danceTournament.startTournament();
        danceTournament.showResults();
    }
}
