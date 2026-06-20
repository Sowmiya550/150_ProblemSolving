//150  
/* Given an integer array of size N, write a program to sort the array; 
Sample input 1: 
4 
2 4 1 3 
Sample output 1: 
1 2 3 4 
Sample input 2: 
5 
1 5 7 5 3 
Sample output 2: 
1 3 5 5 7 */

//Normal Code

import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){                 // First value
      for(int j= i+1;j<n;j++){            // Second Value
        if(arr[i] > arr[j]){              //If first value is greater than second value print first and move to next value
          int temp = arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
    for(int i =0;i<n;i++){                    // To print the sorted arrray
      System.out.print(arr[i]+ " ");
    }
  }

// Placement/Exam/Assessment Pattern (We can use the Arrays.sort() method)

  
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    for(int i =0;i<n;i++){                    // To print the sorted arrray
      System.out.print(arr[i]+ " ");
    }
  }
}
  
    
