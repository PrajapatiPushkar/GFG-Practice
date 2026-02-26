package LogicBuildingProblems.BasicProblem;

import java.util.Scanner;

public class SumOfSquares {

    public static int summation(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += (i * i);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your number");
        int n = sc.nextInt();
        System.out.println(summation(n));
    }
}
