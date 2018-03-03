package by.tryput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DanceTournament {

    private List<Dancer> registerDancers = new ArrayList<>();
    private Map<Dancer, Integer> tournamentResults = new HashMap<>();

    public void addNewDancer(Dancer dancer) {
        registerDancers.add(dancer);
    }

    public void startTournament() {
        registerDancers.forEach(dancer -> {
            dancer.dance();
            tournamentResults.put(dancer, dancer.getResult());
        });
    }

    public void showResults() {
        tournamentResults.forEach((k, v) ->
                System.out.println("Dancer " + k.getName() + " performed " + v
                        + " elements on sequence " + k.getDanceProgram().getSequence()));
    }
}
