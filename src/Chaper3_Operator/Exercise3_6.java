package Chaper3_Operator;

import java.util.Scanner;

public class Exercise3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요: ");

        int num, result;
        num = scanner.nextInt();
        result = 10 - num % 10;
        System.out.println("결과: " + result);

    }
}
//힌트: 나머지 연산자를 사용하라.
//result = num의 값보다 크면서 가장 가까운 10의 배수 - num