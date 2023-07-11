# CountingWords
 
 1. [Introduction](#introduction)
 2. [Functionality](#functionality)
 3. [Tests](#Tests)
 4. [Run](#Run)

 ## Introduction
 This project is setup for a code assessment at Ordina. The goal is simple: make a REST API that counts words. For a piece of text it calculates the frequency of words. It does so in three ways: highest frequency of a word, the frequency of a specific word and the top n words based on frequency. This translates to these POST-requests:
 - CalculateHighestFrequency: String text (JSON)
    - Returns the highest frequency of a word in the text.
 - CalculateFrequencyForWord: String text, String word (JSON)
    - Returns the frequency for the given word in the text.
 - CalculateMostFrequentNWords: String text, int n (JSON)
    - Returns list of top n most frequent words and its frequencies.

This project is made using IntelliJ (IDEA 2023.1.3).

 ## Tests
 Two classes have been tested; WordFrequency and WordFrequencyAnalyzer. The tests can be run using IntelliJ IDEA.

 ## Run
This REST API can be run using Docker or IntelliJ. The application uses port 8080 (http://localhost:8080)

*Note this application uses Java 17*

### IntelliJ
To run application using IntelliJ, the class 'CountingWordsApplication' should be run.

### Docker
To run this application using Docker, Docker Desktop and a software which can execute a bash script should be installed. For the bash script git bash can be used. After the setup, the bash script named "[dockerrun.sh](dockerrun.sh)" should be executed.
