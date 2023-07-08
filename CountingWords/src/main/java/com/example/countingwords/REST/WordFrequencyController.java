package com.example.countingwords.REST;

import com.example.countingwords.REST.RequestBodies.FrequencyWordRequestBody;
import com.example.countingwords.REST.RequestBodies.MostFrequentNWordsRequestBody;
import com.example.countingwords.Service.IWordFrequency;
import com.example.countingwords.Service.IWordFrequencyAnalyzerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WordFrequencyController {

    @Autowired
    private IWordFrequencyAnalyzerService wordFrequencyAnalyzerService;

    @PostMapping(value = "/calculateHighestFrequency")
    public int calculateHighestFrequency(@RequestBody String text) {
        return wordFrequencyAnalyzerService.calculateHighestFrequency(text);
    }

    @PostMapping(value = "/calculateFrequencyForWord")
    public int calculateFrequencyForWord(@RequestBody FrequencyWordRequestBody requestBody) {
        return wordFrequencyAnalyzerService.calculateFrequencyForWord(requestBody.text, requestBody.word);
    }

    @PostMapping(value = "/calculateMostFrequentNWords")
    public List<IWordFrequency> calculateMostFrequentNWords(@RequestBody MostFrequentNWordsRequestBody requestBody) {
        return wordFrequencyAnalyzerService.calculateMostFrequentNWords(requestBody.text, requestBody.n);
    }
}
