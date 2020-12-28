package edu.lesson;

import java.util.Random;

public class KoefArray {
    public static void main(String[] args) {
        Integer[][] twoDimArray = initRandomArray(5);
        printArr(twoDimArray);

    }
    public static Integer[][] initRandomArray(int size) {
        Random random = new Random();
        Integer [][] twoDimArray = new Integer[size][size];
        for (int i=0; i< twoDimArray.length; i++) {
            Integer[] innerArray = twoDimArray[i];
            for (int j=0; j< innerArray.length; j++){
                int koef = 1;
                if(random.nextInt(2)==0) {
                    koef = -1;
                }
                innerArray[j] = random.nextInt(60) * koef;

            }
        }
        return twoDimArray;
    }

    public static void printArr(Integer[][] twoDimArray) {
        for (int i = 0; i < twoDimArray.length; i++) {
            Integer[] intFirst = twoDimArray[i];
            for (int j = 0; j < intFirst.length; j++) {
                System.out.print(intFirst[j] + " ");
            }
            System.out.println();
        }
    }
}

