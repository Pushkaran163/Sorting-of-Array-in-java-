import java.util.Arrays;

public class Program1{
    public static void main(String[] args){

        int[] arr = {1, 78, 89, 3, 2, 5, 99, 33};
        System.out.println("Original Array is: " + Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("Sorted Arrays is : " + Arrays.toString(arr));
    }
}