package Chaper3_Operator;

import java.util.Scanner;

public class Exercise3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요: ");

        int num, result;
        num = scanner.nextInt();
        result = (num/10)*10+1;
        System.out.println("결과: " + result);
    }
}
