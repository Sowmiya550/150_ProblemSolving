import java.util.*;
public class PrimeCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start: ");
        int start = sc.nextInt();
        System.out.print("Enter end: ");
        int end = sc.nextInt();
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        System.out.println("Number of primes = " + count);
        sc.close();
    }
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}




OR


class Solution {
    public int countPrimesInRange(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i))
                count++;
        }
        return count;
    }
    boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}


"""
  "Example"
Find number of primes between 1 and 10

Input
start = 1
end = 10

🔁 Step 1: Loop runs from 1 to 10
Check each number:
👉 i = 1
isPrime(1)
1 ≤ 1 → Not Prime
count = 0

👉 i = 2
isPrime(2)
2 > 1
Loop: i * i = 4 > 2 → no loop
Prime
count = 1

👉 i = 3
isPrime(3)
Check till √3 ≈ 1
No divisor
Prime
count = 2

👉 i = 4
isPrime(4)
4 % 2 == 0 → Not Prime
count = 2

👉 i = 5
isPrime(5)
Check 2
No division
Prime
count = 3

👉 i = 6
6 % 2 == 0 → Not Prime
count = 3

👉 i = 7
No divisor till √7

Prime
count = 4

👉 i = 8
8 % 2 == 0 → Not Prime

👉 i = 9
9 % 3 == 0 → Not Prime

👉 i = 10
10 % 2 == 0 → Not Prime

✅ Final Result
Prime numbers:
2, 3, 5, 7
Output
Number of primes = 4

"""
