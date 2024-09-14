// Java program to Sort a Subarray in Descending order
// Using Arrays.sort()

import java.util.Arrays;
import java.util.Collections;

public class Program3 {
    public static void main(String[] args){
        Integer[] arr = {11, 78, 89, 3, 2, 5, 99, 33, 2, 7, 9};

        System.out.println("Original Array is: " + Arrays.toString(arr));

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println("Array Sorted in descending order: " + Arrays.toString(arr));
    }
}
