package com.tushar.dsa.numbersystemandbitmanipulation;

public class NumberSystemAndBitManipulation {

    public static void main(String[] args){
         System.out.println("Hello World");
         andOperation(3,4);
         orOperation(3, 4);
         xorOperation(3, 4);
        int[] numbers = {1,1,2,2,3,4,4,5,5,6,6,7,7};
        findUniqueNumberInAnArray(numbers);
    }

    public static void andOperation(int a , int b){
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("a&b="+(a&b));
    }

    public static void orOperation(int a , int b){
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("a&b="+(a|b));
    }

    public static void xorOperation(int a , int b){
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("a^b="+(a^b));
    }

    /**
     * In an Integer array find the number which doesnot appear in a pair
     * */
    public static void findUniqueNumberInAnArray(int[] numbers){
        int result = 0;
        for(int i : numbers){
            result ^= i;
        }
        System.out.println(result+" does not appear in pair");
    }
}
