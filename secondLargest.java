/* Find second largest element in an array 
Given an array of N integers and we have to find its second largest element using 
Java program. 
Input: 
Enter number of elements: 4 
Input elements: 45, 25, 69, 40 
Output: 
Second largest element in: 45 */

//Normally using sorting

import java.util.*;
public class Main{
  public static void main(String[] agrs){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i =0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    System.out.println(arr[n-2]);
  }
}

// Without using sort()

import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i =0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int largest=arr[0];
     for(int i =0;i<n;i++){
       if(arr[i] > largest){
         largest = arr[i];
       }
     }
    int secondLargest = Integer.MIN_VALUE;
    for(int i =0;i<n;i++){
      if(arr[i] != largest && arr[i] > secondLargest){
        secondLargest = arr[i];
      }
    }
    System.out.println(secondLargest);
  }
}

// Another leetcode or placement style

import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i =0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int largest =Integer.MIN_VALUE;         // -infinity
    int secondLargest = Integer.MIN_VALUE;

    for(int num:arr){                     //for(int i = 0;i <array.length ; i++)
      if (num > largest){
         secondLargest = largest;         //Old Largest → Second Largest ,New Number → Largest
         largest = num;
      }
      else if(num != largest && num > secondLargest){
        secondLargest = num;
      }
    }
    System.out.println(secondLargest);
  }
}
    
        
      
    


    
  
