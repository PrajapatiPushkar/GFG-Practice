package LogicBuildingProblems.EasyProblem;

import java.util.Scanner;

public class TriangleChecker {
    public static int checkValidity(int a, int b, int c){
        if (a + b <= c || a + c <= b || b + c <= a)
            return 0;
        else
            return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of first side: ");
        int a = sc.nextInt();
        System.out.print("Enter the size of first side: ");
        int b = sc.nextInt();
        System.out.print("Enter the size of first side: ");
        int c = sc.nextInt();

        if (checkValidity(a, b, c) == 1){
            System.out.println("valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }
    }
}
