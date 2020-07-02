package lesson1;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = getArray(15, 0, 30);
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println("Array is sorted " + isArraySortes(arr));
        System.out.println(Arrays.toString(arr));
    }

    private static int[] getArray(int size, int min, int max) {
        int[] arr = new int[size];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = (int) (Math.random() * (max - min + 1) + min); //+1 нужен, чтобы включить максимальный элемент
        }
        return arr;
    }

    public static void sort(int[] arr) { //д
        // ля красоты (чтобы не указывать больше ничего)
        sort(arr, 0, arr.length);
    }

    private static void sort(int[] arr, int from, int to) {
        //if (to > from) {
        if (to - from > 1) {
            int middle = (from + to) / 2;
            sort(arr, from, middle); 
            sort(arr, middle, to);
            merge(arr, from, middle, to);
        }
    }

    private static void merge(int[] arr, int from, int middle, int to) {
        int[] arr1 = Arrays.copyOfRange(arr, from, middle);//стандартный метод, который умеет создавать массив на основе части массива исходного
        int[] arr2 = Arrays.copyOfRange(arr, middle, to);

        int x1 = 0, x2 = 0;
        int i = from;

        while (x1 < arr1.length && x2 < arr2.length){
            /*(
            if (arr1[x1] < arr2[x2]){
                arr[i] = arr1[x1++];
                x1++; можно убрать и сделать вот так (см выше)
            }
            else {
                arr[i] = arr2[x2];
                x2++;
            }
            i++;
             */

            arr[i++] = (arr1[x1] < arr2[x2] ? arr1[x1++] : arr2[x2++]); //всё это одной строчкой. ++ увеличат переменные только со следующего цикла
        }
        while (x1 < arr1.length){ //нужен в момент, когда один из кусочков закончился, а один остался, выполняется только один while из двух
            arr[i++] = arr1[x1++];
        }

        while (x2 < arr2.length){
            arr[i++] = arr2[x2++];
        }
    }

    public static boolean isArraySortes(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}

/*
merge:
                    i
* [5, 8, 20, 35, 40]

              j
* [2, 4, 15, 48, 70]

[2, 4, 5, 8, 15, 20, 35, 40, 48,  70]




sort:
[1,0,40,23,3,14,15,7]
   [1,0,40,23,                 3,14,15,7]
[1,0,        40,23,         3,14,      15,7]
[1,    0,    40,    23,     3,    14,    15,   7]

0,1          23,40          3,14         7,15
     0,1,23,40                  3,7,14,15

              0,1,3,7,14,15,23,40

необязательно между финальными частями мердж использовать - м.и бабл, если она подходит больше
*/
