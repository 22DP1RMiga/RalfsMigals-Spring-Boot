package rvt;

public class Search {
    public static int binarySearch(int[] array, int valueToSearch) {
        int startIndex = 0;
        int endIndex = array.length - 1;

        int middle = 0;

        while (startIndex < endIndex + 1) {
            middle = (endIndex + startIndex) / 2;

            if (array[middle] == valueToSearch) {
                return middle;
            } else if (array[middle] < valueToSearch) {
                startIndex = middle + 1;
            } else if (array[middle] > valueToSearch) {
                endIndex = middle - 1;
            } else {
                System.out.println("Something went wrong!");
            }
        }
        return -1;
    }
}