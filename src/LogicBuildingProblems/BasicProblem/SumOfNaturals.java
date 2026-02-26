package LogicBuildingProblems.BasicProblem;

import java.util.Scanner;

public class SumOfNaturals {

    public static int findSum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;  // sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        System.out.println(findSum(n));
    }
}
