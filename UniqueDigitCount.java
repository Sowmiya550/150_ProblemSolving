import java.util.Scanner;
public class UniqueDigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] seen = new boolean[10];  // 0 to 9
        int count = 0;
        if (n == 0) {
            count = 1;
        } else {
            while (n != 0) {
                int digit = n % 10;
                if (!seen[digit]) {
                    seen[digit] = true;
                    count++;
                }
                n = n / 10;
            }
        }
        System.out.println(count);
        sc.close();
    }
}




OR


class Solution {
    public int countUniqueDigits(int n) {
        boolean[] seen = new boolean[10];
        int count = 0;
        if (n == 0)
            return 1;
        while (n != 0) {
            int d = n % 10;
            if (!seen[d]) {
                seen[d] = true;
                count++;
            }
            n /= 10;
        }
        return count;
    }
}
