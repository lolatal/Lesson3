package edu.lesson;

public class HomeworkExercise6 {
    public static void main(String[] args) {
        int[] array = new int[4];
        boolean isIncreasing = true;
        for(int i=0; i< array.length; i++) {
            array[i] = (int)(Math.random()*11);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for(int i=1; i< array.length; i++){
            if(array[i]<array[i-1]) {
                isIncreasing = false;
                break;
            }
        } if(isIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}
