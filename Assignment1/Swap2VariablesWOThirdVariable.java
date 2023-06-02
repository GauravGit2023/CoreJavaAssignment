package Assignment1;

public class Swap2VariablesWOThirdVariable {
    public static void main(String[] args) {
        int a = 56;
        int b = 34;
        System.out.println("Before swapping numbers: a = "+a+" ,b = "+b);

        a = a+b;
        //  swapping numbers
        b = a-b;
        a = a-b;

        System.out.println("After swapping: a ="+a+" ,b = "+b);
    }
}
