package LogicBuildingProblems.BasicProblem;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first num: ");
        int a = sc.nextInt();
        System.out.print("Enter your second num: ");
        int b = sc.nextInt();

        System.out.println("A = " + a + " B = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("A = " + a + " B = " + b);
    }
}
