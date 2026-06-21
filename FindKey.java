/* Find the Key: 
input1=3521, input2=2452, input3=1352 
Key= Smallest number from input1+ Smallest number from input2+ Smallest 
number from input3+ largest number from input1+ largest number from input2+ 
largest number from input3 
Key=1+2+1+5+5+5=19 */

// Normal Method

import java.util.*;
public class Main{
    public static int findkey(int n1,int n2, int n3){
        int nums[] ={n1,n2,n3};
        int key = 0;
        for( int num:nums){
            int smallest = 9;
            int largest = 0;
            
            while(num > 0){
                int digit = num % 10;
                
                if(digit < smallest)
                    smallest = digit;
                if(digit > largest)
                    largest = digit;
                    num = num / 10;
            }
            key += smallest+largest;
        }
        return key;
    }
    public static void main(String[] args){
        System.out.println(findkey(3521,2452,1352));
    }
}


//placement friendly

class Solution {
    static int value(int num){
        int min = 9;
        int max = 0;
        while(num > 0){
            int digit = num % 10;
            min = Math.min(min, digit);
            max = Math.max(max, digit);
            num /= 10;
        }
        return min + max;
    }
    public static int findKey(int input1, int input2, int input3){
        return value(input1)
             + value(input2)
             + value(input3);
    }
}
