package com.tushar.dsa.t002_arraysanddynamicarrays;

import java.util.Arrays;

public class ArraysandDynamicArrays {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        reverseAnArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseAnArray(int[] arr){
        for(int i=0; i< arr.length/2; i++){
            int value = arr[i];
            arr[i] = arr[arr.length - 1 -i];
            arr[arr.length - 1 -i] = value;
        }
    }
}
