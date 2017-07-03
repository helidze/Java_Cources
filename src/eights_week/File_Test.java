package eights_week;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by George on 03.07.2017.
 */
public class File_Test {
    public static void main(String[] args) {

        File directory = new File("D:\\Java_Cources\\test_dir");

        File file = new File("D:\\Java_Cources\\test_dir", "file.txt");

        File file1 = new File(directory, "file1.txt");

        System.out.println(directory.exists());
        System.out.println(file1.isFile());
        System.out.println(directory.isDirectory());

        if (file.exists() && file.isFile()) {
            try {
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.append("File");
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        } else {
            try {
                if (file1.createNewFile()) {
                    FileWriter fileWriter1 = new FileWriter(file1);
                    fileWriter1.append("Create new File");
                    fileWriter1.flush();
                    fileWriter1.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    }

