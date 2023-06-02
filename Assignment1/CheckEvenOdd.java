package Assignment1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter the number to be checked:");

        // taking user input
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        // checking for odd or even
        if (a%2==1) {
            System.out.println("ODD NUMBER");
        } else {
            System.out.println("EVEN NUMBER");
        }

        sc.close();
    }
}
