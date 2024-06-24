package by.aston.java.base_1_intensive.lesson_4;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {2, 5, 9, 4, 3};
        sortBubble(arr);
        System.out.println(Arrays.toString(arr));




    }

    public static void sortBubble(int[] arr) {
        for (int j = arr.length-1; j >=1; j--) {  //Внешний цикл
            int temp = 0;
            for (int i = 0; i < arr.length  - j; i++) {       //Внутренний цикл
                if (arr[i] < arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

}
