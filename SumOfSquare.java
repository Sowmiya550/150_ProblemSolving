/*  Given an integer array of size N. Write Program to find sum of positive square elements in the array.
Sample input 1: 4 1 2 3 4
Sample output 1: 30
Explanation : (1 + 4 + 9 + 16) = 30
Sample input 2: 4 -1 -2 -3 -4
Sample output 2: 30
Explanation: (1 + 4 + 9 + 16) = 30 */

//Code

import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i =0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int sum = 0;
    for(int i = 0; i< n; i++){
      sum = sum + (arr[i] * arr[i]);     //we can also write like sum += (arr[i] * arr[i]); 
    }
    System.out.println(sum);
  }
}

//for exams we can use long datatype for sum like(long sum = sum + (arr[i] * arr[i])
