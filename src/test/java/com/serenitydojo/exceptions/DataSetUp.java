package com.serenitydojo.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DataSetUp {
    public static void loadTestData() throws IOException {

        String fileContent = Files.readString(Paths.get("src/main/resources/test-data/sample-data.txt"));

    }
}
