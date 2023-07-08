package com.example.countingwords.Service;

public class WordFrequency implements IWordFrequency {

    public String word;
    public int frequency;

    public WordFrequency(String word, int frequency) {
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
