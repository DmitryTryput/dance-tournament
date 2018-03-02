package by.tryput;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class RandomSequenceGenerator {

    private RandomSequenceGenerator() {
    }

    private static final int SEQUENCE_MAX_LENGTH = 49;
    private static final int SEQUENCE_MIN_LENGTH = 2;


    public static List<Integer> generateRandomSequence(int elementMaxValue) {
        ArrayList<Integer> generatedSequence = new ArrayList<>();
        int sequenceLength = new Random().nextInt(SEQUENCE_MAX_LENGTH - 1) + SEQUENCE_MIN_LENGTH;
        for (int i = 0; i < sequenceLength; i++) {
            generatedSequence.add(new Random().nextInt(elementMaxValue + 1));
        }
        return generatedSequence;
    }
}
