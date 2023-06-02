package Assignment1;

import java.util.Scanner;

public class MultiplyFloatNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers for addition :");
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        float product = a * b;
        System.out.println(product); // printing to console
        sc.close();
    }
}
