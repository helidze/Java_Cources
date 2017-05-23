package first_week;


import java.io.StringReader;
import java.util.*;

/**
 * Created by George on 15.05.2017.
 */

/**
 * Task0. Поменять местами самую большую и самую маленькою чар

 Task1. Ввести с консоли строку с символами и пробелами. Посчитать количество слов в предложении.

 Task2. Удалить из предложения слова которые повторяются.

 Task3. Заданы два массива одинаковой длинны с любыми значениями
 скопировать данные из первого массива во второй.

 Task4. Верхний регистр.

 Напишите программу, которая позволяет пользователю ввести в консоли строку,
 переводит первый символ слов в верхний регистр и результат выводит в консоль

 Ввод:
 иван васильевич

 Вывод:
 Иван Васильевич
 */
public class practice1 {
    public static void main(String[] args) {
        //      deleteTheSame();
        //      howManyWords();
        //     copyArray();
        //   toUpperCase();
    }

    public static void howManyWords() {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int count = 1;
        for (int i = 0; i < a.toString().length(); i++) {
            if (a.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println(count);
    }


    public static void deleteTheSame() {
        Scanner scanner = new Scanner(System.in);
        String[] c = scanner.nextLine().split(" ");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < c.length; i++) {
            if (!list.contains(c[i])) {
                list.add(c[i]);
            }

        }

//                Set<String> set = new LinkedHashSet<>(Arrays.asList(c));
//                String[] result = set.toArray(new String[set.size()]);
        String cString = Arrays.toString(list.toArray());
        System.out.println(cString);
    }

    public static void copyArray() {
        int[] firstAr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] lastArr = new int[10];

        System.arraycopy(firstAr, 0, lastArr, 0, 10);
        for (int i = 0; i < lastArr.length; i++) {
            System.out.print(lastArr[i] + " ");
        }
    }

    public static void toUpperCase() {
        Scanner scanner = new Scanner(System.in);
        String c = scanner.nextLine();

    }
}