package edu.lesson;
import java.util.Scanner;
public class DemoMethods {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        int sum = sum(a,b);
        printInt(sum);
        var scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int newSum = sum(a, number);
        printInt(newSum);


    }
    public static int sum(int a, int b) {
        var sum = a+b;
        var string = "a + b";
        return sum;
    }
    public static int sum (int a, String stringNumber){
        int b = Integer.parseInt (stringNumber);
        int sum = a + b;
        return sum;
    }

    public static int sum (int a) {
        int sum  = a + a;
        return sum;
    }
    public static void printInt(int number) {
        System.out.println("Это целочисленный типа данных = " + number);

    }
}
