import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        String evenOdd1 = num1 % 2 == 0 ? "even" : "odd";
        String evenOdd2 = num2 % 2 == 0 ? "even" : "odd";
        String evenOdd3 = num3 % 2 == 0 ? "even" : "odd";

        System.out.println(num1 + " is " + evenOdd1);
        System.out.println(num2 + " is " + evenOdd2);
        System.out.println(num3 + " is " + evenOdd3);
    }
}

