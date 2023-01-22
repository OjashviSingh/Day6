import java.util.*;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a perfect number or not :");
        int num = sc.nextInt();
        int temp = 0;
        for(int i=1; i<=num/2; i++) {
            if(num%i == 0) {
                temp += i;
            }
        }
        if(temp == num) {
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " is not a perfect number");
        }
    }
}
