package org.Project;
/*
.Write a program to print out
duplicate elements from an Array of Strings?

 */
public class T10 {
    public static void main(String[] args) {

        String [] arr = {"Bohdan","Kate","Sino","Dana","Sino", "Bohdan"};

        for (int i = 0; i < arr.length; i++) {
            for (int j =i+1; j <arr.length ; j++) {
                if (arr[i].equals(arr[j])){
                    System.out.println("Duplicate is "+arr[i]);
                }
            }

        }

    }
}
