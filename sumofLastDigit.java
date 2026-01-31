import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        int sum = (a % 10) + (b % 10);
        System.out.println(sum);
    }
}

OR

  class Solution {
    public int sumOfLastDigits(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        int lastDigitA = a % 10;
        int lastDigitB = b % 10;
        return lastDigitA + lastDigitB;
    }
}
