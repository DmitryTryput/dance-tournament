package by.tryput;

import java.util.ArrayList;
import java.util.List;

public final class PerformedElementsCounter {

    private static final int UNINTERESTING_VIEW = -1;

    private PerformedElementsCounter() {
    }

    public static int countElements(List<Integer> sequence) {
        List<Integer> passedPoints = new ArrayList<>();
        int position = 0;
        int resultMoves = 0;
        while (true) {
            if (passedPoints.contains(position)) {
                return UNINTERESTING_VIEW;
            }
            passedPoints.add(position);
            int countOfSteps = sequence.get(position);
            if (countOfSteps % 2 == 0) {
                if (position + countOfSteps < sequence.size()) {
                    resultMoves += countOfSteps;
                    position += countOfSteps;
                } else {
                    return resultMoves + position;
                }
            } else {
                if (position - countOfSteps >= 0) {
                    resultMoves += countOfSteps;
                    position -= countOfSteps;
                } else {
                    return resultMoves + position;
                }
            }
        }
    }
}
