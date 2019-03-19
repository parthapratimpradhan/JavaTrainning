package com.learn.java;


/**
 * 
 * @author parthapradhan
 * his is a demo task.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
 *
 */

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        boolean[] resArr = new boolean[A.length+1];
        for(int n : A){
            if(n<resArr.length&&n>0){
                resArr[n-1]=true;
            }
        }
        for(int b=0; b<resArr.length; b++){
            if(!resArr[b]){
                return b+1;
            }
        }
        return resArr.length;
    }
}
