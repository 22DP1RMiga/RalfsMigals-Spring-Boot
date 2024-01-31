package rvt;

public class Sorter {

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {

            int indexOfSmallestFrom = indexOfSmallestFrom(array, i);
            swap(array, i, indexOfSmallestFrom);
        }
    }

    public static int smallest(int[] array) {

        int smallestElement = array[0];
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallestElement) {
                smallestElement = array[i];
            }
        }
        return smallestElement;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int indexOfSmallest = startIndex;
        for (int i = startIndex + 1; i < array.length; i++) {
            if (array[i] < array[indexOfSmallest]) {
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static int swap(int[] array, int index, int IndexOfSmallest) {
        int tempVar = array[index];
        array[index] = array[IndexOfSmallest];
        array[IndexOfSmallest] = tempVar;

        return array[index];
    }
}