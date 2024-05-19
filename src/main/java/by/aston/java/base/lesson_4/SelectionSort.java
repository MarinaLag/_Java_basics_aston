package by.aston.java.base.lesson_4;

public class SelectionSort {
    public static void main(String[] args) {
        int[] testArr = new int[]{6, 3, 8, 2, 6, 9, 4, 11, 1};
        sortBySelect(testArr);
        for (int i : testArr) {
            System.out.println(i);
        }
    }
    public static void sortBySelect(int[] array) {

        for (int j = 0; j < array.length-1; j++) { // внешний обычный  цикл
            int min = j;

            for (int i = j + 1; i < array.length; i++) { // обычный цикл, но с отчетом с сортированных чисел
                if (array[i] < array[min]) {
                    min = i;
                }
            }
            int temp = array[j];     // вставка отссортиованного числа, в положеную ему ячейку
            array[j] = array[min];
            array[min] = temp;
        }
    }
}
