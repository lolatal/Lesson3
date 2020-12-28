package edu.lesson;
import java.util.Scanner;
public class Functions {
    public static void main(String[] args) {
        int temp = multiply(3,4);
        System.out.println(temp);
    }

    public static int multiply (int a, int b) {
        int result = 0;
        for (int i=0; i<b; i++)
            result+=a;
        return result;
    }
}
