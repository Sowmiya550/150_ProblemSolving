public class OddCount{
  public static void main(String[] args){
    int[] arr = {10,23,45,26,53,22};
    int count = 0;
    for (int i = 0; i<arr.length;i++){
      if(arr[i] %2 != 0){
        count ++;
      }
    }
    System.ouot.println("Number of Odd Numbers:" + count);
  }
}


OR

class Solution{
 public int CountOdds(int a,int b,int c,int d,int e){
   int [] arr = {a,b,c,d,e};
   int count = 0;
   for(num:arr){
     if(num % 2 != 0){
       count++
     }
   }
    return count;
 }
}



OR

class Solution{
 public int CountOdds(int a,int b,int c,int d,int e){
   int count = 0;
   if(a % 2 != 0)count++;
   if(b % 2 != 0)count++;
   if(c % 2 != 0)count++;
   if(d % 2 != 0)count++; 
   if(e % 2 != 0)count++;
   return count;
 }
}  
