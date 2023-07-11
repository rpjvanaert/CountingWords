package com.example.countingwords.Unit.Service;

import com.example.countingwords.Service.WordFrequency;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

public class WordFrequencyTests {

    @Test
    public void testValidWordFrequency_Init() {
        String word = "the";
        int frequency = 3;

        WordFrequency wordFrequency = new WordFrequency(word, frequency);

        Assertions.assertEquals(word, wordFrequency.getWord());
        Assertions.assertEquals(frequency, wordFrequency.getFrequency());
    }

    @Test
    public void testInvalidWordFrequency_InitEmptyWord() {
        String word = "";
        int frequency = 3;

        Assertions.assertThrows(IllegalArgumentException.class, () -> new WordFrequency(word, frequency));
    }

    @Test
    public void testInvalidWordFrequency_InitWithBlankWord() {
        String word = "   ";
        int frequency = 3;

        Assertions.assertThrows(IllegalArgumentException.class, () -> new WordFrequency(word, frequency));
    }

    @Test
    public void testInvalidWordFrequency_InitWithNegativeFrequency() {
        String word = "the";
        int frequency = -13;

        Assertions.assertThrows(IllegalArgumentException.class, () -> new WordFrequency(word, frequency));
    }

    @Test
    public void testAddFrequency() {
        String word = "the";
        int frequency = 3;

        WordFrequency wordFrequency = new WordFrequency(word, frequency);
        wordFrequency.addFrequency();

        frequency++;
        Assertions.assertEquals(frequency, wordFrequency.getFrequency());
    }

    @Test
    public void testCompareTo_DifferentFrequencies() {
        WordFrequency wordFrequency1 = new WordFrequency("the", 5);
        WordFrequency wordFrequency2 = new WordFrequency("apple", 3);

        int result = wordFrequency1.compareTo(wordFrequency2);

        Assertions.assertTrue(result < 0); // Higher frequency first
    }

    @Test
    public void testCompareTo_EqualFrequenciesAndDifferentWords() {
        WordFrequency wordFrequency1 = new WordFrequency("and", 5);
        WordFrequency wordFrequency2 = new WordFrequency("the", 5);

        int result = wordFrequency1.compareTo(wordFrequency2);

        Assertions.assertTrue(result < 0); // Alphabetically
    }

    @Test
    public void testCompareTo_EqualFrequenciesAndSameWords() {
        WordFrequency wordFrequency1 = new WordFrequency("the", 5);
        WordFrequency wordFrequency2 = new WordFrequency("the", 5);

        int result = wordFrequency1.compareTo(wordFrequency2);

        Assertions.assertEquals(0, result); // Same frequency and word
    }

    @Test
    public void testToString() {
        String word = "the";
        int frequency = 5;

        WordFrequency wordFrequency = new WordFrequency(word, frequency);

        String expectedString = "{" + word + " : # " + frequency + "}";
        Assertions.assertEquals(expectedString, wordFrequency.toString());
    }
}
