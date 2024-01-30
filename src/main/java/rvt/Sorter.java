package rvt;

public class Sorter {
    // public static void sort(int[] array) {
    //     for (int i = 0; i < array.length; i++) {

    //         int indexOfSmallestFrom = indexOfSmallestFrom(array, i);
    //         swap(array, i, indexOfSmallestFrom);

    //         System.out.println(Arrays.toString(array));
    //     }
    // }

    public static void smallest(int[] array) {

        int smallestElement = array[0];
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallestElement) {
                smallestElement = array[i];
            }
        }
    }
}