package org.Project;
/*
Write a java program to find the
 second largest number in the array?
 */
public class T9 {
    public static void main(String[] args) {


        int[] arr = {1, 2, 12, 13, 7, 8, 14};

        int larNum = 0;
        int secNum = 0;

        for (int n:arr) {
            if (n>larNum){
                secNum=larNum;
                larNum=n;
            } else if (n > secNum) {
                secNum=n;
            }
        }
        System.out.println("The Second Largest Number in the Array is "+secNum);

    }
}
