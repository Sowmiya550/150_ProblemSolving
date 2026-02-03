import java.util.*;
public class Factorial{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int fact = 1;
    for (int i = 1;i <= n; i++ ){
      fact = fact*i;
    }
    System.out.println(fact);
    sc.close();
  }
}


OR


class Solution{
  public int factorial(int n){
    int fact = 1;
    for(int i = 1; i <= n; i++){
      fact *= i;
    }
    return fact;
  }
}
