import java.util.*;
public class EvenCount{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in); // getting input from the User
    int[] arr = new int[5];              // number of 5 inputs
    int count = 0;
    System.out.println("Enter 5 numbers:");
    for(int i =0;i<5;i++){               // Read 5 numbers
      arr[i] = sc.nextInt();
    }
    for(int i = 0; i <arr.length; i++){  
      if(arr[i] % 2 == 0){               // checks if it is even or not
        count++;
      }
    }
    System.out.println("Number of even numbers:" + count);
  }
}



OR

class Solution{
  public int countEvens(int a,int b,int c,int d,int e){
      int[] arr = {a,b,c,d,e};
      int count = 0;
      for(num:arr){
        if(num % 2 == 0){
           count++;
        }
    }
  return count;
  }
}
