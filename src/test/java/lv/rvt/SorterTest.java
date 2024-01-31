package lv.rvt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import rvt.Sorter;

public class SorterTest {

    // rvt.Sorter sorter = new rvt.Sorter();

    @Test
    public void testSmallest() {
        int[] intArray = {3, 4, -4, 5, 66 , 4, 12};
        assertEquals(-4, Sorter.smallest(intArray));
    }

    @Test
    public void testIndexOfSmallestFrom() {
        int[] intArray = {3, 4, -4, 5, 66 , 4, 12};
        assertEquals(5, Sorter.indexOfSmallestFrom(intArray, 3));
    }

    @Test
    public void testSwap() {
        int[] intArray = {3, 4, -4, 5, 66 , 4, 12};
        assertEquals(-4, Sorter.swap(intArray, 1, 2));
    }

}