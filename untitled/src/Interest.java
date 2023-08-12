import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        double money = 0;
        int month = 1;
        double interest_rate = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = scanner.nextDouble();
        System.out.println("Enter the number of months: ");
        month = scanner.nextInt();
        System.out.println("Enter the annual interest rate in percentage: ");
        interest_rate = scanner.nextDouble();
        double total_interest = 0;
        for (int i = 0; i < month; i++){
            total_interest = money * (interest_rate/100/12) * 3;
        }
        System.out.println("total_of_interest: " + total_interest);
    }
}