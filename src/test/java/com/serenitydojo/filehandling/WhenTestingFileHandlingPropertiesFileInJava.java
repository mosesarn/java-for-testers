package com.serenitydojo.filehandling;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WhenTestingFileHandlingPropertiesFileInJava {
    Properties prop = new Properties();
   // String path = System.getProperty("user.dir")+"/project.properties";

    String path = "src/test/java/com/serenitydojo/filehandling/project.properties";
    FileInputStream fileInputStream;

    {
        try {
            fileInputStream = new FileInputStream(path);
            prop.load(fileInputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

@Test
    public void readingPropertiesFileValues(){
    System.out.println(prop.getProperty("userName"));
    System.out.println(prop.getProperty("Password"));
    System.out.println(prop.getProperty("QA_URL"));
}
}
