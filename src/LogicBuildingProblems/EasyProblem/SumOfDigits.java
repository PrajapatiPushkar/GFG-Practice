package LogicBuildingProblems.EasyProblem;

import java.util.Scanner;

public class SumOfDigits {

    public static int sumOfDig(int n) {
        int sum = 0;
        while (n != 0){
            int last = n % 10;

            sum += last;

            n /= 10;      // n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your digits: ");
        int n = sc.nextInt();
        System.out.println(sumOfDig(n));
    }
}
