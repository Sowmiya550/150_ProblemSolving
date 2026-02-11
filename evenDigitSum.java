import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        n = Math.abs(n);   // handle negative
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            n = n / 10;
        }
        System.out.println(sum);
        sc.close();
    }
}




OR


class Solution {
    public int evenDigitSum(int n) {
        int sum = 0;
        n = Math.abs(n);
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0)
                sum += digit;
            n /= 10;
        }
        return sum;
    }
}
