package rvt;

public class MainProgram2 {
    public static void smallest(int[] array) {

        int smallestElement = array[0];
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallestElement) {
                smallestElement = array[i];
            }
        }
    }
}