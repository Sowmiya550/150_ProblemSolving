public class EvenOddCount{
  public static void main(String[] args){
    int[] arr = { 10,23,45,66,80};
    int evenCount = 0;
    int oddCount = 0;
    for (int i = 0; i< arr.length ; i++){
      if(arr[i] % 2 == 0 ){
        evenCount++;
      } else {
         oddCount++;
      }
      System.out.println("Even numbers count:" + evenCount);
      System.out.println("Odd numbers count:" + oddCount);
    }
  }

  
OR


public int[] countEvenOdd(int a,int b,int c,int d,int e){
  int evenCount = 0;
  int oddCount = 0;
  if(a % 2 == 0)evenCount++;else oddCount++;
  if(b % 2 == 0)evenCount++;else oddCount++;
  if(c % 2 == 0)evenCount++;else oddCount++;
  if(d % 2 == 0)evenCount++;else oddCount++;
  if(e % 2 == 0)evenCount++;else oddCount++;
  return new int[]{evenCount,oddCount};
}


OR

  
public int[] countEvenOdd(int a,int b,int c,int d,int e){ 
  int[] nums = {a,b,c,d,e};
  int even = 0,odd = 0;
  for(num:nums){
    if(num % 2 == 0)
       even++;
    else
       odd++;
  }
  return new int[]{even,odd};
}  
  
