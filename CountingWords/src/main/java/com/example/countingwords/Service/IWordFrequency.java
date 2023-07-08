package com.example.countingwords.Service;

public interface IWordFrequency extends Comparable<IWordFrequency> {
    String getWord();
    int getFrequency();
}
