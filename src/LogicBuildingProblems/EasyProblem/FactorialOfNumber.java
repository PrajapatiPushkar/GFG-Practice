package LogicBuildingProblems.EasyProblem;

import java.util.Scanner;

public class FactorialOfNumber {
    public static int factorial(int n){
        int ans = 1;
        for (int i = 2; i <= n; i++){
            ans *= i;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}
