package edu.lesson;
public class HomeworkExercise4 {
    public static void main(String[] args) {
        int[] randomArray = new int [20];
        for (int i=0; i<20; i++) {
            randomArray[i] = (int) (Math.random() * 21);
            System.out.print(randomArray[i] + " ");
        }
        System.out.println();
        for (int i=0; i< randomArray.length; i++){
            if (i%2!=0) {
                randomArray[i]=0;
            }
            System.out.print(randomArray[i] + " ");
        }
    }
}
