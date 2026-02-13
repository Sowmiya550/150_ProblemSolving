import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();      // number input
        String option = sc.next(); // "even" or "odd"
        int sum = 0;
        n = Math.abs(n);
        while (n > 0) {
            int digit = n % 10;
            if (option.equals("even") && digit % 2 == 0) {
                sum += digit;
            }
            else if (option.equals("odd") && digit % 2 != 0) {
                sum += digit;
            }
            n = n / 10;
        }
        System.out.println(sum);
        sc.close();
    }
}




OR


class UserMainCode {
    public int EvenOddDigitsSum(int input1, String input2) {
        int sum = 0;
        input1 = Math.abs(input1);
        while (input1 > 0) {
            int digit = input1 % 10;
            if (input2.equals("even") && digit % 2 == 0) {
                sum += digit;
            }
            else if (input2.equals("odd") && digit % 2 != 0) {
                sum += digit;
            }
            input1 /= 10;
        }
        return sum;
    }
}
