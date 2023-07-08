package com.example.countingwords.Service;

public class WordFrequency implements IWordFrequency, Comparable<IWordFrequency> {

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

    public void addFrequency() {
        this.frequency++;
    }

    @Override
    public int compareTo(IWordFrequency o) {
        int compareFrequency = Integer.compare(this.frequency, o.getFrequency()) * -1;

        if (compareFrequency != 0) return compareFrequency;

        return this.word.compareTo(o.getWord());
    }

    @Override
    public String toString() {
        return "{" + this.word + " : # " + this.frequency + "}";
    }

}
