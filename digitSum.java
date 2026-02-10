import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sign = 1;
        // If negative, store sign
        if (n < 0) {
            sign = -1;
            n = Math.abs(n);
        }
        // Repeat until single digit
        while (n >= 10) {
            int sum = 0;
            while (n > 0) {
                sum = sum + (n % 10);
                n = n / 10;
            }
            n = sum;
        }
        System.out.println(sign * n);
        sc.close();
    }
}





OR


class UserMainCode {
    public int digitSum(int input1) {
        boolean isNegative = false;
        if (input1 < 0) {
            isNegative = true;
            input1 = Math.abs(input1);
        }
        while (input1 >= 10) {
            int sum = 0;
            while (input1 > 0) {
                sum += input1 % 10;
                input1 /= 10;
            }
            input1 = sum;
        }
        if (isNegative)
            return -input1;
        else
            return input1;
    }
}





OR




public int digitSum(int n) {

    if (n == 0)
        return 0;

    int sign = (n < 0) ? -1 : 1;
    n = Math.abs(n);

    int result = 1 + (n - 1) % 9;

    return sign * result;
}

