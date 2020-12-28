package edu.lesson;

public class HomeworkExercise5 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
       int sum1 = 0;
       int sum2=0;
        double average1;
        double average2;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int)(Math.random()*16);
            array2[i] = (int)(Math.random()*16);
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int i=0; i< array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        for (int i=0; i< array1.length; i++) {
            sum1+=array1[i];
        }
        for (int i=0; i< array2.length; i++){
            sum2+=array2[i];
        }
        System.out.println();
        average1 = (double)sum1/5;
        average2 = (double)sum2/5;
        System.out.println("Среднее арифметическое первого массива = " + average1);
        System.out.println("Среднее арифметическое второго массива = " + average2);
        if (average1<average2) {
            System.out.println("Среднее арифметическое второго массива больше среднего арифметического первого массива");
        } else if (average2<average1) {
            System.out.println("Среднее арифметическое первого массива больше среднего арифметического второго массива");
        } else {
            System.out.println("Среднее арифметическое первого массива равно среднему арифметическому второго массива");
        }
    }
}