package com.example.countingwords.Controller.RequestBodies;

public class MostFrequentNWordsRequestBody {
    public final String text;
    public final int n;

    public MostFrequentNWordsRequestBody(String text, int n) {
        this.text = text;
        this.n = n;
    }
}
