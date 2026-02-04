import java.util.*;
public class NthPrime{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    int num = 1;
    while(count < n){
      num++;
      if(isPrime(num))
        count++;
    }
    System.out.println(num);
    sc.close();
  }
  static boolean isPrime(int x){
    if(x <= 1)
      return false;
    for(int i = 2; i * i <= x ; i++){
      if(x % i == 0)
        return false;
    }
    return true;
  }
}



OR



class Solution{
  public int nthPrime(int n){
     int count = 0;
    int num = 1;
    while(count < n){
      num++;
      if(isPrime(num))
        count++;
    }
    return num;
  }
  static boolean isPrime(int x){
    if(x <= 1)
      return false;
    for(int i = 2; i * i <= x ; i++){
      if(x % i == 0)
        return false;
    }
    return true;
  }
}
