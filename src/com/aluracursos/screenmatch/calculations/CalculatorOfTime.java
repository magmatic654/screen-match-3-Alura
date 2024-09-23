package com.aluracursos.screenmatch.calculations;
import com.aluracursos.screenmatch.models.Title;

public class CalculatorOfTime {
    private int totalTime;

    public void includes(Title title){
        this.totalTime += title.getLengthInMinutes();
    }

    public int getTotalTime() {
        return totalTime;
    }
}
