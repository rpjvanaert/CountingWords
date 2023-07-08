package com.example.countingwords.REST.RequestBodies;

public class MostFrequentNWordsRequestBody {
    public final String text;
    public final int n;

    public MostFrequentNWordsRequestBody(String text, int n) {
        this.text = text;
        this.n = n;
    }
}
