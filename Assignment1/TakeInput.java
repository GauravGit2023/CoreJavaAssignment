package Assignment1;

import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = sc.nextInt();

        System.out.println(a); // printing to console
        sc.close();
    }
}
