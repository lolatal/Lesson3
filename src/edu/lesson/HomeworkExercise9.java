package edu.lesson;
import java.util.Scanner;

public class HomeworkExercise9 {
    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        int quantity;
        System.out.println("Укажите положительное число");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            do {
                quantity = scanner.nextInt();
                if (quantity % 2 != 0 || quantity < 1)
                    System.out.println("Вы ввели неподходящее число, попробуйте еще раз");
            }
            while (quantity % 2 != 0 || quantity < 1);
            int[] array = new int[quantity];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 16);
                System.out.print(array[i] + " ");
            }
            System.out.println();
            int half = array.length / 2;
            for (int i = 0; i < half; i++) {
                sum1 += array[i];
            }
            for (int i = half; i < array.length; i++) {
                sum2 += array[i];
            }
            if (sum1 > sum2) {
                System.out.println("Сумма первой половины (" + sum1 + ") больше суммы второй половины (" + sum2 + ")");
            } else if (sum2 > sum1) {
                System.out.println("Сумма второй половины (" + sum2 + ") больше суммы первой половины (" + sum1 + ")");
            } else {
                System.out.println("Сумма первой половины массива равна сумме второй половины");
            }
        }else System.out.println("Вы ввели не число, начните программу заново");
    }
}

