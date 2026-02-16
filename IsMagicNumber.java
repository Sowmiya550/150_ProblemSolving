import java.util.Scanner;
public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = n;
        while (result > 9) {
            int sum = 0;
            while (result > 0) {
                sum += result % 10;
                result /= 10;
            }
            result = sum;
        }
        if (result == 1)
            System.out.println("Magic Number");
        else
            System.out.println("Not Magic Number");
    }
}



OR

class Solution {
    public boolean isMagicNumber(int n) {
        while (n > 9) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }
}


OR

static boolean isMagic(int n) {              //Shortcut method
    return n % 9 == 1;
}
