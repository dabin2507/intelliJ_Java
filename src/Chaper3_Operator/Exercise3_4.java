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
/*
아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다 만일 변수 num 의 값이 '456'이라면
'400'이 되고 '111'이라면 ‘100’이 된다 이에 알맞은 코드를 넣으시오.
* */