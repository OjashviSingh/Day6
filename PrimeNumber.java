import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a prime number or not :");
        int num = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.println(num + " is a prime number.");
                break;
            } else
                System.out.println(num + " is not a prime number.");
        }
    }
}