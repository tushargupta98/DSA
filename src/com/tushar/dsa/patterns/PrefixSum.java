package com.tushar.dsa.patterns;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrefixSum {
    public static void main(String[] args) {
        //getSubArraySum(new int[]{1,2,3,4,5,6,7,8});
        //findAllSubArrays(new int[]{1, 2, 3, -2, 5});
        findAllSubArraysEfficient(new int[]{1, 2, 3, -2, 5});
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

    /**
     * Problem: Find Number of Subarrays with Sum Equal to K
     * Given an array of integers arr[] and an integer K, your task is to find the number of contiguous subarrays that sum up to K.
     * Input: arr = [1, 2, 3, -2, 5]
     *        K = 5
     * Output: 3
     *
     *
     * */

    static void findAllSubArrays(int[] nums){ // Time Complexity O(n^2)
        int[] sum = new int[nums.length+1];
        sum[0] = 0;
        int target = 5;
        for(int i = 1; i < sum.length; i++){
            sum[i] = sum[i-1]+ nums[i-1];
            System.out.println(sum[i]);
        }
        int totalSubArrays = 0;

        for(int start = 0; start < sum.length; start++){
            for(int end = start+1; end < sum.length; end++){
                if(sum[end]-sum[start] == target){
                    totalSubArrays++;
                }
            }
        }
        System.out.println(totalSubArrays);
    }

    static void findAllSubArraysEfficient(int[] nums){ // Time Complexity O(n)
        int sum = 0, count =0;
        int target = 5;
        Map<Integer, Integer> frequencyMap  = new HashMap<>();
        frequencyMap.put(0,1);
        for(int num : nums){
            sum += num;
            if(frequencyMap.containsKey(sum - target)){
                count += frequencyMap.get(sum-target);
            }
            frequencyMap.put(sum, frequencyMap.getOrDefault(sum,0)+1);
        }
        System.out.println(count);
    }
}


