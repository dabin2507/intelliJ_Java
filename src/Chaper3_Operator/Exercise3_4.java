package Chaper3_Operator;

import java.util.Scanner;

public class Exercise3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요: ");

        int num, result;

        num = scanner.nextInt();
        result = (num/100)*100;
        System.out.println("결과: " + result);
    }
}
//나눗셈 연산자는 반올림을 하지 않고 버림을 한다.
//int = 456