import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1, c;
        if (n == 0)
            System.out.println(a);
        else if (n == 1)
            System.out.println(b);
        else {
            for (int i = 2; i <= n; i++) {   // i = 2 gives here start from 0 1
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println(b);
        }
        sc.close();
    }
}




OR



class Solution {
    public int nthFibonacci(int n) {
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        int a = 0, b = 1, c = 0;
        for (int i = 3; i <= n; i++) {   // i = 3 take while we does not take 0 lets take from 1 1 
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
