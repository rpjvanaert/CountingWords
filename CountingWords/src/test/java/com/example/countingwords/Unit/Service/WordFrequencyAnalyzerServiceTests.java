package com.example.countingwords.Unit.Service;

import com.example.countingwords.Service.IWordFrequency;
import com.example.countingwords.Service.WordFrequency;
import com.example.countingwords.Service.WordFrequencyAnalyzerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

public class WordFrequencyAnalyzerServiceTests {


    private WordFrequencyAnalyzerService analyzerService;

    @BeforeEach
    void setUp() {
        analyzerService = new WordFrequencyAnalyzerService();
    }
    @Test
    void testHighestFrequency_LowercaseText() {
        String text = "the sun shines over the lake";

        int result = analyzerService.calculateHighestFrequency(text);

        Assertions.assertEquals(2, result);
    }

    @Test
    void testHighestFrequency_NormalText() {
        String text = "The sun shines over the lake";

        int result = analyzerService.calculateHighestFrequency(text);

        Assertions.assertEquals(2, result);
    }

    @Test
    void testHighestFrequency_RandomLowerUppercaseText() {
        String text = "tHe sUn sHines OveR thE lAKe";

        int result = analyzerService.calculateHighestFrequency(text);

        Assertions.assertEquals(2, result);
    }

    @Test
    void testCalculateFrequencyForWord_case1() {
        String text = "The sun shines over the lake";
        String word = "The";

        int result = analyzerService.calculateFrequencyForWord(text, word);

        Assertions.assertEquals(2, result);
    }

    @Test
    void testCalculateFrequencyForWord_case2() {
        String text = "The sun shines over the lake";
        String word = "sun";

        int result = analyzerService.calculateFrequencyForWord(text, word);

        Assertions.assertEquals(1, result);
    }

    @Test
    void testCalculateFrequencyForWord_case3() {
        String text = "The sun shines over the lake";
        String word = "moon";

        int result = analyzerService.calculateFrequencyForWord(text, word);

        Assertions.assertEquals(0, result);
    }

    @Test
    void testGetFrequencyNWords_amount3() {
        String text = "The sun shines over the lake";
        int amount = 3;

        List<IWordFrequency> result = analyzerService.calculateMostFrequentNWords(text, amount);


        Assertions.assertEquals(amount, result.size());

        Assertions.assertEquals("the", result.get(0).getWord());
        Assertions.assertEquals(2, result.get(0).getFrequency());

        Assertions.assertEquals("lake", result.get(1).getWord());
        Assertions.assertEquals(1, result.get(1).getFrequency());

        Assertions.assertEquals("over", result.get(2).getWord());
        Assertions.assertEquals(1, result.get(2).getFrequency());
    }

    @Test
    void testGetFrequencyNWords_amount2() {
        String text = "The sun shines over the lake";
        int amount = 2;

        List<IWordFrequency> result = analyzerService.calculateMostFrequentNWords(text, amount);


        Assertions.assertEquals(amount, result.size());

        Assertions.assertEquals("the", result.get(0).getWord());
        Assertions.assertEquals(2, result.get(0).getFrequency());

        Assertions.assertEquals("lake", result.get(1).getWord());
        Assertions.assertEquals(1, result.get(1).getFrequency());
    }
}
