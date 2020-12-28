package edu.lesson;

public class HomeworkExercise8 {
    public static void main(String[] args) {
        int [] array1 = new int [10];
        int [] array2 = new int [10];
        double[] array3 = new double [10];
        int counter = 0;
        for (int i=0; i< array1.length; i++) {
            array1[i] = (int)(Math.random()*10 + 1);
            array2[i] = (int)(Math.random()*10 + 1);
            array3[i] = (double)array1[i]/array2[i];
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int i=0; i< array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        for (int i=0; i< array3.length; i++) {
            System.out.print(array3[i] + "  ");
            if (array3[i]%1==0) {
                counter++;
            }
        }
        System.out.println();
        System.out.println("Количество целых элементов в третьем массиве = "+ counter);
    }
}
