package edu.lesson;
import java.util.Scanner;
public class HomeworkExercise2 {
    public static void main(String[] args) {
        int[] oddArray = new int [50];
        for (int i=0, a=1; i< oddArray.length; a+=2, i++) {
            oddArray[i] = a;
            System.out.print(oddArray[i] + " ");
        }
        System.out.println();
        for (int i = oddArray.length - 1; i>=0; i--) {
            System.out.print(oddArray[i] + " ");
        }
    }
}
