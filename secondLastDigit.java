import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = Math.abs(n);
        if (n < 10) {
            System.out.println("No second last digit");
        } else {
            int secondLast = (n / 10) % 10;
            System.out.println(secondLast);
        }
    }
}


OR

  class Solution{
     public int secondLastDigit(int n){
       n = Main.abs(n);
       if (n < 10){
         return -1;
       }
       return(n / 10) % 10;
     }
}
