import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();                      // Input two integers N and M
        int M = sc.nextInt();
        if (N == 0 || M == 0) {                    // Check if either N or M is zero
            System.out.println(3);
        }
        else if (N % M == 0) {                    // Check if N is exact multiple of M
            System.out.println(2);
        }
        else {                                    // Otherwise, not an exact multiple
            System.out.println(1);
        }
        sc.close();
    }
}



OR

  class Solution {
    public int isExactMultiple(int N, int M) {
        if (N == 0 || M == 0) {      //  Check if any input is zero
            return 3;
        }
        if (N % M == 0) {           // Check if N is an exact multiple of M
            return 2;
        }
        return 1;                   // Otherwise, N is not an exact multiple of M
    }
}
