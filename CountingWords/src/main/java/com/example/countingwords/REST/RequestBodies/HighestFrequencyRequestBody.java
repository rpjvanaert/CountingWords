package com.example.countingwords.REST.RequestBodies;

public class HighestFrequencyRequestBody {
    public final String text;

    public HighestFrequencyRequestBody(String text) {
        this.text = text;
    }

    //@TODO maybe delete, see WordFrequencyController first method
}
