import java.util.Scanner;  // (or) import.java.util.*;
public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
        sc.close();
    }
}



OR


class Solution {
    public boolean isPrime(int n) {     
        if (n <= 1)
            return false;                
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}


"""
 if in the question they asked in boolean like 0,1,2 
class Solution {
    public boolean isPrime(int n) {     
        if (n <= 1)
            return 0;                
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return 2;
        }
        return 1;
    }
}
  """
  
