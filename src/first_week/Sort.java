package first_week;

import java.util.Arrays;

/**
 * Created by George on 24.05.2017.
 */
public class Sort {
    public static int iter;
    public static void main(String[] args) {
        int [] arr = getArray(10);

        int [] clone = getArrayCopy(arr);
        System.out.println(Arrays.toString(clone));
        stupidSort(clone);
        System.out.println(Arrays.toString(clone) + "\n Глупая сортировка. Итерации: "
                + iter);
        System.out.println();

        clone = getArrayCopy(arr);
        System.out.println(Arrays.toString(clone));
        bubbleSort(clone);
        System.out.println(Arrays.toString(clone) + "\n Пузырьковая сортировка. Итерации: "
                + iter);
        System.out.println();

        clone = getArrayCopy(arr);
        System.out.println(Arrays.toString(clone));
        shakeSort(clone);
        System.out.println(Arrays.toString(clone) + "\n Шейкерная сортировка. Итерации: "
                + iter);
        System.out.println();
    }

    public static int [] getArray(int n){
        int [] array = new int [n];
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*100);
        }
        return array;
    }

    public static int [] getArrayCopy(int [] arr){
        int [] copy = new int [arr.length];
        System.arraycopy(arr, 0, copy, 0, arr.length);
        return copy;
    }

    public static void swap(int [] arr, int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static void stupidSort(int [] arr){
        iter = 0;
        for(int i = 0; i < arr.length-1; i++){
            if (arr[i] > arr[i + 1]) {
                swap(arr, i, i+1);
                i = -1;
            }
            iter++;
        }
    }

    public static void bubbleSort(int [] arr){
        iter = 0;
        for(int i = arr.length-1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
                iter++;
            }
            iter++;
        }
    }

    public static void shakeSort(int [] arr){
        int left = 0, right = arr.length-1;
        iter = 0;
        while(left < right) {
            for(int i = left; i < right; i++){
                if(arr[i] > arr[i+1]){
                    swap(arr, i, i+1);
                }
                iter++;
            }
            right--;

            for(int j = right; j > left; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
                iter++;
            }
            left++;
            iter++;
        }
    }
}
