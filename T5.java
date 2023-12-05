package org.Project;
/*
Write a program to swap 2 numbers
 without a temporary variable?
 */
public class T5 {
    public static void main(String[] args) {


        int num1=10;
        int num2=20;

        System.out.println("Before the swap num1="+num1+", num2="+num2);

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After the swap num1="+num1+", num2="+num2);
    }
}
