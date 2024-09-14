// Java program to Sort a Subarray in Array
// Using Arrays.sort() method

import java.util.Arrays;

public class Program2 {
    public static void main(String[] args){
        int[] arr = {11, 78, 89, 3, 2, 5, 99, 33, 2, 7, 9};

        System.out.println("Original Array is: " + Arrays.toString(arr));

        Arrays.sort(arr, 1, 5);

        System.out.println("Sorted Arrays is : " + Arrays.toString(arr));
    }
}
