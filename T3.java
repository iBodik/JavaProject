package org.Project;
/*
Create a 2D array or integer type where you
 will store odd and even
numbers. Develop a program which will identify/
print the even numbers
only.
 */
public class T3 {

    public static void main(String[] args) {

        int [] [] num = {
                {10,12,13,14},
                {15,16,17,18},
                {19,20,21,22}
        };

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j]%2==0){
                    System.out.print(num[i][j]+" ");
                }
            }
            System.out.println();

        }

    }
}
