package by.tryput;

import java.util.ArrayList;
import java.util.List;

public class DanceFloor {

    private static final int UNINTERESTING_VIEW = -1;

    private List<Integer> sequence = new ArrayList<>();
    private List<Integer> passedPoints = new ArrayList<>();
    private int position;
    private int steps;
    private boolean canDance = true;

    public DanceFloor(List<Integer> sequence) {
        this.sequence.addAll(sequence);
    }

    public int getResult() {
        return steps;
    }

    public void dance() {
        while (canDance) {
            move();
        }
        position = 0;
    }

    private void move() {
        if (isLooped()) {
            canDance = false;
            return;
        }
        passedPoints.add(position);
        countSteps();
    }

    private void countSteps() {
        int countOfSteps = sequence.get(position);
        if (isEven(countOfSteps)) {
            if (position + countOfSteps < sequence.size()) {
                steps += countOfSteps;
                position += countOfSteps;
            } else {
                endDance();
            }
        } else {
            if (position - countOfSteps >= 0) {
                steps += countOfSteps;
                position -= countOfSteps;
            } else {
                endDance();
            }
        }
    }

    private void endDance() {
        steps += position;
        canDance = false;
    }

    private boolean isLooped() {
        if (passedPoints.contains(position)) {
            steps = UNINTERESTING_VIEW;
            return true;
        }
        return false;
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }
}
