package LogicBuildingProblems.BasicProblem;

import java.util.Scanner;

public class CheckEvenOrOdd {

    public static boolean isEven(int n){
        int rem = n % 2;
        if (rem == 0){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int n = sc.nextInt();
        if (isEven(n)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
