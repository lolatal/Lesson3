package edu.lesson;

public class HomeworkExercise3 {
    public static void main(String[] args) {
        int[] randomArray = new int[15];
        int evenCounter = 0;
        for (int i = 0; i < 15; i++) {
            randomArray[i] = (int) (Math.random() * 100);
        }
        for (int i=0; i<randomArray.length; i++) {
            if (randomArray[i] % 2 == 0) {
                evenCounter++;
            }
            System.out.print(randomArray[i] + " ");
        }
            System.out.println();
            System.out.print("Количество четных чисел в массиве = " + evenCounter);
                    }
                }

