package eights_week;

import java.io.File;

/**
 * Created by George on 03.07.2017.
 */
public class File_Test {
    public static void main(String[] args) {

        File directory = new File("D:\\Java_Cources\\test_dir");

        File file = new File("D:\\Java_Cources\\test_dir", "file.txt");

        File file1 = new File(directory,"file1.txt");

        System.out.println(directory.exists());
        System.out.println(file1.isFile());
        System.out.println(directory.isDirectory());
    }
}
