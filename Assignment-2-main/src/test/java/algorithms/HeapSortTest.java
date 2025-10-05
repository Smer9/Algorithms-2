package algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HeapSortTest {

    @Test
    public void testSortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        HeapSort sorter = new HeapSort();
        sorter.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testReverseArray() {
        int[] arr = {5, 4, 3, 2, 1};
        HeapSort sorter = new HeapSort();
        sorter.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testRandomArray() {
        int[] arr = {3, 1, 4, 1, 5, 9};
        HeapSort sorter = new HeapSort();
        sorter.sort(arr);
        assertArrayEquals(new int[]{1, 1, 3, 4, 5, 9}, arr);
    }

    @Test
    public void testSingleElement() {
        int[] arr = {42};
        HeapSort sorter = new HeapSort();
        sorter.sort(arr);
        assertArrayEquals(new int[]{42}, arr);
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        HeapSort sorter = new HeapSort();
        sorter.sort(arr);
        assertArrayEquals(new int[]{}, arr);
    }
}
