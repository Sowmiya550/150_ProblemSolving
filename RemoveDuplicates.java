/* Remove duplicate elements from an array 
Given an array of integers, we have to remove duplicate elements using a java 
program. 
Input array elements: 
1, 2, 3, 1, 2, 3, 4 
Output: 
Elements after removing duplicates 
1, 2, 3, 4 */

//Normal method using nestedloops

import java.util.*;
public class Main{
  public static void main(String[] args){
    int arr[] ={ 1, 2, 3, 1, 2, 3, 4};
    for(int i = 0; i< arr.length;i++){
      boolean duplicate = False;
      for(int j = 0; j< i;j++){
        if(arr[i] == arr[j]){
          duplicate = True;
          break;
        }
        if(!duplicate){
          System.out.println(arr[i] + " ");
        }
      }
    }
  }


// Using ArrayList method

import java.util.*;
public class Main{
  public static void main(String[] args){
    int arr[] ={ 1, 2, 3, 1, 2, 3, 4};
    ArrayList<Integer> list = new ArrayList();
    for (int num:arr){
      if (!list.contains(num)){                     // If number not already Present, Add it
        list.add(num);
      }
    } 
    System.out.println(list);
  }
}

//  Using HashSet :       HashSet--> Removes Duplicates   ;    LinkedHashSet-->Removes Duplicates and Keeps Original Order

import java.util.*;
public class Main{
  public static void main(String[] args){
    int arr[] ={ 1, 2, 3, 1, 2, 3, 4};
    set<Integer> set = new LinkedHashSet<>();
    for(int num:arr){
      set.add(num);
    }
    System.out.println(set);
  }
}





