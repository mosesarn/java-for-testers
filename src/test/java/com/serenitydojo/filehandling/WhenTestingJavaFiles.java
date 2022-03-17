package com.serenitydojo.filehandling;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WhenTestingJavaFiles {

    File file = new File("C:\\Users\\moses\\CreateNew.txt");
    @Test
    public void createFileInJava() {
        try {
            File file = new File("C:\\Users\\moses\\CreateNew1.txt");
            if (file.createNewFile()){
                System.out.println("file Created "+file.getName());
            }else {
                System.out.println("file already exists ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void writeToFileInJava(){
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\moses\\CreateNew.txt");
            fileWriter.write("Writing a text into the file, using FileWriter.write()");
            fileWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void readAFile(){
        try {
            File myObj = new File("C:\\Users\\moses\\CreateNew.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    @Test
    public void deleteAFile(){
        File myObj = new File("C:\\Users\\moses\\CreateNew1.txt");
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
