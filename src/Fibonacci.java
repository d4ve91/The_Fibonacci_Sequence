import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        
        int fib [] = new int[100];

        System.out.println("How many Fibonacci numbers should I find? ");


        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        fib [0] = 1;
        fib [1] = 1;

        for (int i = 2; i < n; i++) 
        {
            fib [i] = fib [i - 1] + fib [i - 2];
        }

        for (int i = 0; i < n; i++) 
        {
            System.out.println("The word number: " + i  + ": " + fib [i]);
        }


        input.close();


    }
    
}
