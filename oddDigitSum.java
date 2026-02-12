import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        n = Math.abs(n);   // handle negative numbers
        while (n > 0) {
            int digit = n % 10;   // get last digit
            if (digit % 2 != 0) {  // check odd
                sum = sum + digit;
            }
            n = n / 10;   // remove last digit
        }
        System.out.println(sum);
        sc.close();
    }
}



OR


class UserMainCode {
    public int oddDigitSum(int input1) {
        int sum = 0;
        input1 = Math.abs(input1);
        while (input1 > 0) {
            int digit = input1 % 10;
            if (digit % 2 != 0)
                sum += digit;
            input1 /= 10;
        }
        return sum;
    }
}
