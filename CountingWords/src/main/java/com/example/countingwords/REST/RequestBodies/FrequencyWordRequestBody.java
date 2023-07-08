package com.example.countingwords.REST.RequestBodies;

public class FrequencyWordRequestBody {
    public final String text;
    public final String word;

    public FrequencyWordRequestBody(String text, String word) {
        this.text = text;
        this.word = word;
    }
}
