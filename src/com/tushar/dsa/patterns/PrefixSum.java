package com.tushar.dsa.patterns;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class PrefixSum {
    public static void main(String[] args) {
        getSubArraySum(new int[]{1,2,3,4,5,6,7,8});
    }
    /**
     * Given an array arr = [1, 3, 5, 7, 9], answer the following queries:
     *
     * Find the sum of elements from index 1 to 3 (inclusive).
     * Find the sum of elements from index 0 to 4 (inclusive).
     * Find the sum of elements from index 2 to 4 (inclusive).
     *
     *
     * */

    static void getSubArraySum(int[] values){
        int[] prefSumArray = new int[values.length];
        List<int[]> queries = new ArrayList<>() ;
        //{1,2,3,4,5,6,7,8}
        queries.add(new int[]{0,2});
        queries.add(new int[]{1,3});
        queries.add(new int[]{1,4});
        queries.add(new int[]{3,6});



        int sum = 0;
        for(int i =0;i<values.length;i++){
            sum += values[i];
            prefSumArray[i] = sum;
        }
        for(int num : prefSumArray){
            System.out.println(num);
        }

        for(int[] range : queries){
            if(range[0]==0){
                System.out.println(prefSumArray[range[1]]);
            }else{
                System.out.println(prefSumArray[range[1]]-prefSumArray[range[0]-1]);
            }
        }
    }
}


