package edu.lesson;
import java.util.Scanner;
public class HomeworkExercise10 {
    public static void main(String[] args) {
        int quantity;
        int evenCounter=0;
        System.out.println("Введите число больше 3");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            do {
                quantity = scanner.nextInt();
                if (quantity % 1 != 0 || quantity < 3)
                    System.out.println("Вы ввели неподходящее число, попробуйте еще раз");
            }
            while (quantity % 1 != 0 || quantity < 3);
            int[] array1 = new int [quantity];
            for(int i=0; i< array1.length; i++) {
                array1[i] = (int)(Math.random()*(quantity+1));
                System.out.print(array1[i] + " ");
                if(array1[i]%2==0 && array1[i]!=0) {
                    evenCounter++;
                }
            }
            System.out.println();
            if (evenCounter > 0) {
                int[] array2 = new int[evenCounter];
                for(int i=0, j=0; i< array1.length; i++) {
                    if (array1[i]%2==0 && array1[i]!=0) {
                        array2[j] = array1[i];
                        System.out.print(array2[j] + " ");
                    }
                }
            }
        }
    }
}