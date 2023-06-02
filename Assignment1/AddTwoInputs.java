package Assignment1;

import java.util.Scanner;

public class AddTwoInputs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers for addition :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a+b;
        System.out.println(sum); // printing to console
        sc.close();
    }
}
