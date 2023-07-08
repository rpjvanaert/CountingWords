package com.example.countingwords.Service;

public class WordFrequencyImpl implements WordFrequency {

    public String word;
    public int frequency;

    public WordFrequencyImpl(String word, int frequency) {
        this.word = word;
        this.frequency = frequency;
    }

    public String getWord() {
        return this.word;
    }

    public int getFrequency() {
        return this.frequency;
    }
}
