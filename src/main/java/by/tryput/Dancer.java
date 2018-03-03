package by.tryput;

import lombok.Getter;

import java.util.List;

@Getter
public class Dancer {

    private DanceProgram danceProgram;
    private String name;

    public Dancer(List<Integer> danceSequence, String name) {
        this.danceProgram = new DanceProgram(danceSequence);
        this.name = name;
    }

    public void dance() {
        danceProgram.dance();
    }

    public int getResult() {
        return danceProgram.getResult();
    }
}
