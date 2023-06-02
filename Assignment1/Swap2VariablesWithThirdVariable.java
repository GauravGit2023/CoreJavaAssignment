package Assignment1;

public class Swap2VariablesWithThirdVariable {
    public static void main(String[] args) {
        int a = 56;
        int b = 34;
        System.out.println("Before swapping "+a+" , "+b);
        // using third variable 'c' to swap
        int c = a;
        a = b;
        b = c;
        System.out.println("After swapping "+a+" , "+b);
    }
}
