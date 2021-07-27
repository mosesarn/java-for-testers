package com.serenitydojo.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class WordCounter {
    public int numOfWordsIn(String value) {
        if(value == null){
            return 0;
        }
        return value.split("\\W").length;
    }

    public int numOfWordsInAFile(String fileName) throws IOException{
        try{
        String fileContents = Files.readString(Paths.get(fileName));
        int wordCount = numOfWordsIn(fileContents);
        if(wordCount == 0){
            throw new FileHasNoWordException("No Words Found in the File :  "+fileName);
        }
        return wordCount;
        }catch(NoSuchFileException noSuchFile){
            System.out.println("NoSuchFileException :  "+noSuchFile);
            throw new FileHasNoWordException("No Words Found in the Non - Existence File :  "+fileName);
        }
}
}
