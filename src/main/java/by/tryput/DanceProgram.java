package by.tryput;

import java.util.ArrayList;
import java.util.List;

public class DanceProgram {

    private static final int UNINTERESTING_VIEW = -1;

    private List<Integer> sequence;
    private List<Integer> passedPoints = new ArrayList<>();
    private int position;
    private int steps;
    private boolean canDance = true;

    public DanceProgram(List<Integer> sequence) {
        this.sequence = sequence;
    }

    public void dance() {
        if (sequence.isEmpty()) {
            throw new ForgotMovesException("Dancer forgot his moves...");
        }
        while (canDance) {
            move();
        }
        passedPoints.clear();
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

    private void addNewSequence(List<Integer> newSequence) {
        sequence.clear();
        sequence.addAll(newSequence);
    }
    private boolean isEven(int number) {
        return number % 2 == 0;
    }

    public List<Integer> getSequence() {
        return sequence;
    }

    public int getResult() {
        return steps;
    }
}
