package com.example.countingwords.Controller.RequestBodies;

public class HighestFrequencyRequestBody {
    public final String text;

    public HighestFrequencyRequestBody(String text) {
        this.text = text;
    }

    //@TODO maybe delete, see WordFrequencyController first method
}
