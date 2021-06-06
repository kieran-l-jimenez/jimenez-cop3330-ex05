import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kieran Jimenez
 */
/*
 *           "Simple Math" output
 * What is the first number? 10
 *What is the second number? 5
 *10 + 5 = 15
 *10 - 5 = 5
 *10 * 5 = 50
 *10 / 5 = 2
 */
public class App
{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        App myApp = new App();

        System.out.print("What is the first number? ");
        int numA = in.nextInt();
        System.out.print("What is the second number? ");
        int numB = in.nextInt();

        myApp.operations(numA, numB);
    }

    public void operations(int A, int B)
    {
        System.out.printf("%d + %d = %d\n", A, B, A+B);
        System.out.printf("%d - %d = %d\n", A, B, A-B);
        System.out.printf("%d * %d = %d\n", A, B, A*B);
        System.out.printf("%d / %d = %d\n", A, B, A/B);
    }
}