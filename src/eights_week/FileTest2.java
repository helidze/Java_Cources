package eights_week;

import java.io.File;
import java.nio.file.Files;

/**
 * Created by George on 03.07.2017.
 */
public class FileTest2 {
    public static void main(String[] args) {

        File directory = new File("D:\\Java_Cources\\test_dir");

        File file = new File("D:\\Java_Cources\\test_dir", "file.txt");

        File file1 = new File(directory, "file1.txt");

        String [] files = directory.list();
        for (String str: files
             ) {
            System.out.println(str);
        }

        System.out.println("List catalog: " + directory.getName());

        File[] files1 = directory.listFiles();

        if (files1.length>0){
            for (File f:files1
                 ) {
                if (!f.isHidden())
                System.out.println("******" + f.getName() + "*******");
                System.out.println(f.getPath());
                System.out.println("Parent dir: " + f.getParent());

            }
        }
            }
}

