package org.Project;
/*
Create a 2D array of integers. Develop a program
which will calculate the
sum of even and odd numbers for that array.
 */
public class T4 {
    public static void main(String[] args) {

        int [] [] arr = {
                {10,21,32},
                {41,50,63},
                {77,80,94}
        };
        int evenSum = 0;
        int oddSum =0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    evenSum = evenSum + arr[i][j];
                } else {
                    oddSum = oddSum + arr[i][j];
                }
            }
        }
        System.out.println("Sum of even numbers for that array =" +evenSum);
        System.out.println("Sum of odd numbers for that array ="+oddSum);





    }
}
