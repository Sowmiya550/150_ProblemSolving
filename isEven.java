import java.util.*;
public class isEven{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        if((num / 2) * 2 == num){ // We can use another method (num % 2 == 0)
            System.out.println("It is Even Number");
        }
        else{
            System.out.println("It is Not a Even number");
        }
    }
}
