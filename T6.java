package org.Project;

import java.util.Scanner;

/*
Write a java program to check whether a
 given number is prime or not?

 */
public class T6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the number:");
        int num = sc.nextInt();
        int count =0;

        for (int i = 0; i < num; i++) {
            if (num%2==0){
                count++;
            }

        }
        if (count==2){
            System.out.println("This number "+num+" is Prime number");
        }else{
            System.out.println("This number "+num+" is NOT Prime number");
        }
    }
}
