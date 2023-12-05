package org.Project;
/*
Create an array of integer values. After the
array is created, calculate the
sum of all stored elements in that array.
 */
public class T2 {
    public static void main(String[] args) {

        int [] arr = {10,20,30,40,50,60,70,80,90};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];

        }
        System.out.println("Sum of all stored elements in that array =" +sum);


    }
}
