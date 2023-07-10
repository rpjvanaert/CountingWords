package com.example.countingwords.Service;

public class WordFrequency implements IWordFrequency, Comparable<IWordFrequency> {

    public String word;
    public int frequency;

    public WordFrequency(String word, int frequency) {
        if (word == null || word.isEmpty() || word.isBlank()) {
            throw new IllegalArgumentException("String cannot be empty");
        }

        if (frequency < 1) {
            throw new IllegalArgumentException("Frequency cannot be less than 1");
        }

        this.word = word;
        this.frequency = frequency;
    }

    public String getWord() {
        return this.word;
    }

    public int getFrequency() {
        return this.frequency;
    }

    public void addFrequency() {
        this.frequency++;
    }

    @Override
    public int compareTo(IWordFrequency o) {
        if (this.frequency != o.getFrequency()) {
            return Integer.compare(this.frequency, o.getFrequency()) * -1;
        }

        return this.word.compareTo(o.getWord());
    }

    @Override
    public String toString() {
        return "{" + this.word + " : # " + this.frequency + "}";
    }

}
