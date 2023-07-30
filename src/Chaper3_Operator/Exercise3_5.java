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
/*
아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다. 만일 변수 num의 값이 333이라면
331이 되고 777이라면 771이 된다 에에 알맞은 코드를 넣으시오.
*/