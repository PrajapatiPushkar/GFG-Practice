package LogicBuildingProblems.EasyProblem;

import java.util.Scanner;

public class ReverseDigitOfNumber {
    static int reverseDigit(int n) {
        int revNum = 0;
        while (n > 0) {
            revNum = revNum * 10 + n % 10;
            n = n / 10;
        }
        return revNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        System.out.println(reverseDigit(n));
    }
}
