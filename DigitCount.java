import java.util.Scanner;
public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if (n == 0) {
            count = 1;
        } else {
            while (n != 0) {
                n = n / 10;
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}




OR

class Solution {
    public int countDigits(int n) {
        if (n == 0)
            return 1;
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}



OR


class Solution {
    public int countDigits(int n) {
        return String.valueOf(Math.abs(n)).length();
    }
}
