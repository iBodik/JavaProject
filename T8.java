package org.Project;
/*
Maximum and minimum number in the array?
 */
public class T8 {
    public static void main(String[] args) {

        int [] arr = {10,200,333,888,145,195,1256,133};

        int max = arr [0];
        int min = arr [0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }else if (arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println("The maximum number is "+max+" and minimum is "+min);

    }
}
