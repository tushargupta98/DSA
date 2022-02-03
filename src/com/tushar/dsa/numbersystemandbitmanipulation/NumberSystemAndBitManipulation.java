package com.tushar.dsa.numbersystemandbitmanipulation;

public class NumberSystemAndBitManipulation {

    public static void main(String[] args){
         System.out.println("Hello World");
/*         andOperation(3,4);
         orOperation(3, 4);
         xorOperation(3, 4);
        int[] numbers = {1,1,2,2,3,4,4,5,5,6,6,7,7};
        findUniqueNumberInAnArray(numbers);*/
        rightShift(3);
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

    public static void rightShift(int number){
        int result = number>>0&1;
        System.out.println(result);
        result = number>>1&1;
        System.out.println(result);
        result = number>>2&1;
        System.out.println(result);
    }

    /**
     * Given a positive integer A, the task is to count the total number of set bits in the binary representation of all the numbers from 1 to A. Return the count modulo 10 [to the power 9] + 7.
     * Note; The issue I faced was because of the timeout
     * */
        public static void numberOfBitsets(int A) {
            long N = A + 1, mod = 1000 * 1000 * 1000 + 7;
            long ans = 0, pow2 = 1;
            for (int i = 0; i < 32; i++) {
                ans += ((N / (pow2 << 1)) * pow2) % mod + Math.max(0, N % (pow2 << 1) - pow2);
                ans %= mod;
                pow2 <<= 1;
            }
            System.out.println((int) ans);
        }

    public static void numberOfBitsetsMySolution(int A) {
        long result = 0;
        for(int i =1 ; i <= A; i++){
            int number = i;
            while(number > 0){
                if((number&1) == 1){
                    result++;
                }
                number = number>>1;
            }
        }
        System.out.println((int)(result % 1000000007));
        }
}
