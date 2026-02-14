import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int reverse = 0;
        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
        if (original == reverse)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        sc.close();
    }
}




OR

class UserMainCode {
    public boolean isPalindrome(int input1) {    //input1 or n we can use
        if (input1 < 0)
            return false;
        int original = input1;
        int reverse = 0;
        while (input1 > 0) {
            int digit = input1 % 10;
            reverse = reverse * 10 + digit;
            input1 /= 10;
        }
        return original == reverse;
    }
}


OR


"""Palindrome number na forward-ah padicha number and reverse-ah padicha number same irukanum.
Example:
121 → reverse 121 → palindrome ✅
252 → reverse 252 → palindrome ✅
123 → reverse 321 → not palindrome ❌
Return values:
Palindrome → return 2
Not palindrome → return 1"""

SOLUTION:

  class Solution {
    public int isPalindrome(int x) {
        // Negative numbers are not palindrome
        if (x < 0) {
            return 1;
        }
        int original = x;
        int reverse = 0;
        while (x > 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }
        if (original == reverse) {
            return 2;
        } else {
            return 1;
        }
    }
}




