import java.util.Scanner;
public class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        int lastDigit = Math.abs(num % 10);    
        System.out.println(lastDigit);
    }
}

// we can also use another logic without using built-in function like (Math.abs)
// [ if(num < 0)
//    num =-num;
//    return num % 10; ]
