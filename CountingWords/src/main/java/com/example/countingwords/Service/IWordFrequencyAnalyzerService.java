package com.example.countingwords.Service;

import java.util.List;

public interface IWordFrequencyAnalyzerService {
    int calculateHighestFrequency(String text);
    int calculateFrequencyForWord(String text, String word);
    List<IWordFrequency> calculateMostFrequentNWords(String text, int n);
}
