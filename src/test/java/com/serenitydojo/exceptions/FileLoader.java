package com.serenitydojo.exceptions;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileLoader {
    public String readHelloWorld(String fileName) throws IOException {
        String path = "src/main/resources/" + fileName;
        String fileContent = Files.readString(Paths.get("src/main/resources/"+fileName));
        return fileContent;
        // return "";//Files.readString(Paths.get("src/main/resources/hello.txt"));
    }

    public boolean fileContainsText(String fileName, String expectedText) {

      //  String path = "src/main/resources/" + fileName;
        try {
            return readHelloWorld(fileName).contains(expectedText);
        } catch (IOException e) {
            return false;
        }
        // return true;// (Files.readString(Paths.get(path)).contains(expectedText));
    }

    public boolean fileHasText(String fileName, String expectedText) throws MissingWelcomeFileException {

        //String path = "src/main/resources/" + fileName;
        try {
            return readHelloWorld(fileName).contains(expectedText);
        } catch (IOException ioException) {
            throw new MissingWelcomeFileException("Missing welcome file: " + fileName, ioException);
        }
        // return true;// (Files.readString(Paths.get(path)).contains(expectedText));
    }
}