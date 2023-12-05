package org.Project;
//1. Create a program that uses an array to store
// a list of temperatures for a week,
//and then uses a loop to find the highest
// and lowest temperature for the week.
public class T1 {
    public static void main(String[] args) {

        int [] temp ={123,55,69,78,66,88,11,111,123,25,98};

        int  highest = temp [0];
        int  lowest =temp [0];

        for (int i = 0; i < temp.length; i++) {
            if (temp[i]>highest){
                highest=temp[i];
            }else if(temp[i]<lowest){
                lowest=temp[i];
            }



        }
        System.out.println("The highest  temperature is "+highest);
        System.out.println("The lowest  temperature is "+ lowest);
    }
}
