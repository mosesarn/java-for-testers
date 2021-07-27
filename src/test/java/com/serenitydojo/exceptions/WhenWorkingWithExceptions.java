package com.serenitydojo.exceptions;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WhenWorkingWithExceptions {

    WordCounter wordCounter = new WordCounter();

    @Test
    public void shouldCountTheWordsInAString(){

        int numberOfWords = wordCounter.numOfWordsIn("Some thing");
        assertThat(numberOfWords).isEqualTo(2);
    }
    @Test
    public void shouldReturnZeroForANullString(){

        assertThat(wordCounter.numOfWordsIn(null)).isEqualTo(0);

    }
    @Test
    public void shouldCountWordsInAFile() throws Exception {

        int numberOfWords = wordCounter.numOfWordsInAFile("src/main/resources/hello.txt");
        assertThat(numberOfWords).isEqualTo(3);
    }
    @Test(expected = FileHasNoWordException.class)
    public void shouldReportAnErrorIfTheFileDoesNotExists()throws Exception, FileHasNoWordException {

            int numberOfWords = wordCounter.numOfWordsInAFile(" file_that_does_not_Exist-file");
            assertThat(numberOfWords).isEqualTo(-1);
    }
    @Test(expected = FileHasNoWordException.class)
    public void shouldThrowMeaningfulExceptionIfNoWordsExists() throws Exception,FileHasNoWordException{
        int numberOfWords = wordCounter.numOfWordsInAFile("src/main/resources/No_Word.txt");
       //assertThat(numberOfWords).isEqualTo(0);
    }

}
