// Java program to sort an array of strings
// in ascending and descending alphabetical order
// Using Arrays.sort()

import java.util.Arrays;
import java.util.Collections;

public class Program4 {
    public static void main(String[] args){
        String[] arr = {"hi", "bye", "hello", "goodbye", "goodnight", "goodmorning", "goodevening", "abc", "bcd", "zxh"};

        System.out.println("Original Array is : " + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Array sorted in ascending order : " + Arrays.toString(arr));

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Array sorted in descending order : " + Arrays.toString(arr));
    }
}
