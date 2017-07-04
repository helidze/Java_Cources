package eights_week.WorkWithFilesApp;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Created by George on 03.07.2017.
 */
public class CrudFiles {
    Scanner scanner = new Scanner(System.in);
    static boolean flag;

    public static void main(String[] args) {
        search("D:\\","java");
    }

    static void search(String path, String find) {
        File directory = new File("D:\\FileAppJava");
        File file = new File(path);
        String[] list = file.list();     //список файлов в текущей папке
        for (String f : list) {      //проверка на совпадение
            if (find.equals(f)) {
                flag = true;
                System.out.println(path + "\\" + f + " !!!!!!!!!!!!!!!!!!");  //если найден, то выход
                return;
            }
            if (!path.endsWith("\\")) {
                path += "\\";
            }
            File tempfile = new File(path , f);
            System.out.println(path + f);
            if (!file.equals(".") && !file.equals("..")) {        //!!!
                if (tempfile.isDirectory()) {      //иначе проверяем, если это папка
                    //path += file;
                    search(path + file, find);               //то рекурсивный вызов этой функции
                    if (flag) return;
                }
            }
        }
    }
}