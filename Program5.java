// Java program to demonstrate Working of
// Comparator interface

import java.util.Arrays;
import java.util.Comparator;


class Student {
    int rollno;
    String Name, Address;

    public Student(int rollno, String Name, String Address){
        this.rollno = rollno;
        this.Name = Name;
        this.Address = Address;
    }

    public String toString(){
        return this.rollno + " " + this.Name + " " + this.Address;
    }
}
class sortbyRoll implements Comparator<Student>{
    public int compare(Student a, Student b){
        return a.rollno - b.rollno;
    }

}

class Program5{
    public static void main(String[] args){
        Student[] arr = {
            new Student(111, "bbbb", "Pune"),
            new Student(131, "aaaa", "Mumbai"),
            new Student(121, "cccc", "Nagpur")
        };
        System.out.println("Unsorted");

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

        // Sorting on basic as per class 1 created
        // (user-defined)
        Arrays.sort(arr, new sortbyRoll());

        System.out.println("\nSorted by rollno");

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

             Arrays.sort(arr, new sortbyRoll());
    }
}