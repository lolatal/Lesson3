package edu.lesson;
import java.util.Scanner;
public class HomeworkExercise1 {
    public static void main(String[] args) {
        int[] evenArray = new int[10];
        for (int i = 0, a = 2; i < evenArray.length; a += 2, i++) {
            evenArray[i] = a;
            System.out.print(evenArray[i] + " ");
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < evenArray.length; i++) {
            System.out.println(evenArray[i]);
        }
    }
}
