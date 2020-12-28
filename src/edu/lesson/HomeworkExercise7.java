package edu.lesson;

public class HomeworkExercise7 {
    public static void main(String[] args) {
        int[] array = new int[12];
        int maxValue = 0;
        int index = 0;
        for (int i=0; i< array.length; i++) {
            array[i] = (int) (Math.random() * 16);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i=0; i< array.length; i++) {
            if (array[i]>= maxValue) {
                maxValue = array[i];
                index = i;
            }
        }
        System.out.println("Максимальный элемент в этом массиве = " + maxValue);
        System.out.println("Индекс его последнего вхождения в массив = " + index);
    }
}
