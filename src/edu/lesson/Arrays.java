package edu.lesson;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        int[] a;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве: ");
        n = in.nextInt();
        a = new int [n];
        for (int i=0; i<n; i++) {
            System.out.println("Введите a[" + i + "] = ");
            a[i] = in.nextInt();
        }
    }
}
