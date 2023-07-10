package com.example.countingwords.Service;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class WordFrequencyAnalyzerService implements IWordFrequencyAnalyzerService {

    public int calculateHighestFrequency(String text) {
        text = text.toLowerCase();

        List<IWordFrequency> frequencyWords = getFrequencyWords(text);

        Collections.sort(frequencyWords);

        return frequencyWords.get(0).getFrequency();
    }

    public int calculateFrequencyForWord(String text, String word) {

        text = text.toLowerCase();
        word = word.toLowerCase();

        String[] words = text.replaceAll("[^a-zA-Z]", " ").split("\\s+");

        int frequency = 0;
        for (String each : words) {
            if (each.equals(word)) frequency++;
        }

        return frequency;
    }

    public List<IWordFrequency> calculateMostFrequentNWords(String text, int n) {

        text = text.toLowerCase();

        List<IWordFrequency> frequencyWords = getFrequencyWords(text);

        Collections.sort(frequencyWords);

        if (frequencyWords.size() <= n) return frequencyWords;
        return frequencyWords.subList(0, n);
    }

    public List<IWordFrequency> getFrequencyWords(String text) { // @TODO bug here, somehow, sometimes a empty char is detected as word

        String[] words = text.replaceAll("[^a-zA-Z]", " ").split("\\s+");

        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {

            int frequency = frequencyMap.getOrDefault(word, 0);

            frequencyMap.put(word, frequency + 1); //@TODO redo with addFrequency function
        }

        List<IWordFrequency> frequencyList = new ArrayList<>();
        for (String word : frequencyMap.keySet()) {
            frequencyList.add(new WordFrequency(word, frequencyMap.get(word)));
        }

        return frequencyList;
    }
}
