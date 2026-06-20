/*  
Count total positives, negatives and zeros from an array 
Given an array of integers and we have to count total negatives, positives and zeros 
using java program. 
Input: 
Array elements: 20, -10, 15, 00, -85 
Output: 
Positive Numbers are: 2 
Negative Numbers are: 2 
Zeros are: 1   */

// NORMAL METHOD

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int positive = 0;
        int negative = 0;
        int zero = 0;
        
        
        for(int i = 0; i<n;i++){
            if(arr[i] > 0){
                positive ++;
            }else if(arr[i] < 0){
                negative++;
            }else{
                zero++;
            }
        
        }
        System.out.println("Positive Numbers are:" + positive);
        System.out.println("Negative Numbers are:" + negative);
        System.out.println("Zeros are:" + zero);
    }
}



//Leetcode Style

class Solution{
  public int[] countNumbers(int[] nums) {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for(int num : nums) {
            if(num > 0)
                positive++;
            else if(num < 0)
                negative++;
            else
                zero++;
        }
        return new int[]{positive, negative, zero};                         // or  we use System.out.println
    }
}
