package eights_week.WorkWithFilesApp;

/**
 * Created by George on 03.07.2017.
 */
public class AppTest {
    public static void main(String[] args) {
        CrudFiles crudFiles = new CrudFiles();

        System.out.println("Выбирите действие: \n" +
        "1 - Find file on local machine\n" +
        "2 - Open only txt file\n" +
        "3 - Delete file/dir from local machine\n" +
        "4 - Close program\n");
        System.out.println("Make your choice: ");
        int choice = crudFiles.scanner.nextInt();
        String fileName = crudFiles.scanner.nextLine();
        System.out.println("Your choice: \n" + choice);

        if (choice == 1){

            crudFiles.search("D:\\","file");
                   }
                   else {
            System.out.println(
                    "end"
            );
        }
    }
}
