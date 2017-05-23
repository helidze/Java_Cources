package first_week;

import java.util.Arrays;

/**
 * Created by George on 24.05.2017.
 */
public class study2 {
    public static int iter;/*
            глупая сортировка - stupid Sort
            Пузырьковая сортировка - Bubble Sort
            Шейкерная сортировка - Shake Sort
            Сортировка выбором - Selection Sort
            Сортировка вставками - Insert Sort*/

    public static void main(String[] args) {
        int[] arr = getArray(10);
        int[] clone = getArrayClone(arr);
        System.out.println(Arrays.toString(clone));
        //  dumpSort(clone);
        bubbleSort(clone);
        //shakeBubble(clone);
        // System.out.println(Arrays.toString(clone) + "\n Глупая сортировка. Итераций: " + iter  );
        // System.out.println(Arrays.toString(clone) + "\n Пузырьковая сортировка. Итераций: " + iter);
        System.out.println(Arrays.toString(clone) + "\n Shake сортировка. Итераций: " + iter);
    }

    public static int[] getArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    public static int[] getArrayClone(int[] arr) {
        int[] copy = new int[arr.length];
        System.arraycopy(arr, 0, copy, 0, arr.length);
        return copy;
    }

    public static void dumpSort(int[] arr) {
        iter = 0; //счетчи итераций

        //
        for (int i = 0; i < arr.length - 1; i++) { //кол-во проходов по циклу
            if (arr[i] > arr[i + 1]) { //сверяем первую и вторую ячейку
                int tmp = arr[i]; //если первая больше второй то меняем местами
                arr[i] = arr[i + 1];// и сбрасываем счетчик
                arr[i + 1] = tmp;
                i = -1;
            }
            iter++;

        }

    }

    public static void bubbleSort(int[] arr) {
        iter = 0; // счетчик итераций

        // берем длинну массива и проходим по нему на один шаг меньше
        //самое большое число должно стать в конец массива
        for (int i = arr.length; i > 0; i--) {
            iter++;
            for (int j = 0; j < i - 1; j++) {
                iter++;
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

//    public static void shakeBubble(int[] arr) {
//        iter = 0;
//
//        for (int i = 0; i < arr.length/2; i++) {
//            boolean swap = false;
//            for (int j = i ; j < arr.length - i - 1; j++) {
//                iter++;
//                if (arr[j] > arr[j + 1]) {
//                    int tmp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = tmp;
//
//
//                }
//
//            }
//            for (int j = arr.length - 2 -i; j > i; j--) {
//                if (arr[j] > arr[j - 1]) {
//                    int tmp = arr[j];
//                    arr[j] = arr[j - 1];
//                    arr[j - 1] = tmp;
//                    swap = true;
//                }
//
//            }
//            if (!swap) break;
//        }
}
