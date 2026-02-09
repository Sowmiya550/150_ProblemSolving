import java.util.Scanner;
public class nonRepeatedCount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] freq = new int[10];   // digits 0-9
        // Count frequency of digits
        while (n != 0) {
            int digit = n % 10;
            freq[digit]++;
            n = n / 10;
        }
        int count = 0;
        // Check which digit appears only once
        for (int i = 0; i < 10; i++) {
            if (freq[i] == 1) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}



OR



class Solution {
    public int nonRepeatedDigitsCount(int n) {
        int[] freq = new int[10];
        while (n > 0) {
            freq[n % 10]++;
            n /= 10;
        }
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] == 1)
                count++;
        }
        return count;
    }
}
