package com.company;

import java.util.Random;
public class Stack {

    private char[] poss = {'S','M', 'L'};
    private char[] arr1;
    private char[]arr2;
    private char[] arr3;



    public Stack(int size){
        Random rand = new Random();
        arr1 = new char[size];
        arr2 = new char[size];
        arr3 = new char[size];

        for(int i = 0; i < size; i++){
            arr1[i] = poss[rand.nextInt(10000) %3];
            arr2[i] = poss[rand.nextInt(10000) %3];
            arr3[i] = poss[rand.nextInt(10000) %3];
        }
    }

    public Stack(int size, int min, int max){
        Random rand = new Random();
        arr1 = new char[rand.nextInt(((max - min)+1)+min)];
        arr2 = new char[rand.nextInt(((max - min)+1)+min)];
        arr3 = new char[rand.nextInt(((max - min)+1)+min)];

        for(int i = 0; i < arr1.length; i++){
            arr1[i] = poss[rand.nextInt(10000)%3];
        }
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = poss[rand.nextInt(10000)%3];
        }
        for(int i = 0; i < arr3.length; i++){
            arr3[i] = poss[rand.nextInt(10000)%3];
        }

    }


    public String toString(){
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i]);
        }
        System.out.println();
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i]);
        }
        System.out.println();
        for(int i = 0; i < arr3.length; i++){
            System.out.print(arr3[i]);
        }
        System.out.println();
        return "";
    }

}
