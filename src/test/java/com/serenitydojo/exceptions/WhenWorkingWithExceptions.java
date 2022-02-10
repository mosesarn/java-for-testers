package com.serenitydojo.exceptions;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static com.serenitydojo.exceptions.DataSetUp.loadTestData;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * Exceptions: NullPointerException , NoSuchFileException,ArithmeticException,
 */
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
    @Test(expected = ArithmeticException.class)
    public void basicArithmeticException ()
    {
        int a = 30, b = 0,c;
        c = a / b;
        System.out.println(" result of division " +c);
    }
    @Test
    public void basicArrayOutBoundORIndexOutOfBoundException(){
        List<String> names = Arrays.asList("Moses","Joshua","Caleb");

        try {
            System.out.println(" Name:  " +names.get(2));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Test
    public void basicIOException(){
        File testDataFile = new File("src/main/resources/test-data/sample-data.txt");
        System.out.println(testDataFile.exists());

        try {
           // String fileContent = Files.readString(Path.of("src/main/resources/test-data/sample-data1.txt"));
            String fileContent = null;
            System.out.println(fileContent.length());
            System.out.println(testDataFile.exists());
        } finally {

        }
    }
   @Test
   public void basicException() throws IOException {

      loadTestData();
   }






    }

