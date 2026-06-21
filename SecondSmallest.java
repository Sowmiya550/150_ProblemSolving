/*  Find second smallest element in an array Given an array of N integers and 
we have to find its second minimum/smallest element using Java program.
Input: Enter number of elements: 4 
Input elements: 45, 25, 69, 40
Output: Second smallest element in: 40   */


// Normal method using Arrays.sort()
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i<n;i++){
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
      System.out.println(arr[1]);
  }
}


//Without using sort()

import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i<n;i++){
      arr[i] = sc.nextInt();
    }
    int smallest=arr[0];
    for(int i =0;i<n;i++){
      if (arr[i] < smallest){
        smallest = arr[i];
      }
    }
    int secondSmallest = Integer.MAX_VALUE;
    for(int i =0;i<n;i++){
      if(arr[i] != samllest && arr[i] < secondSmallest){
        secondSmallest = arr[i];
      }
    }
    System.out.println(secondSmallest);
  }
}

