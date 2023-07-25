package Chaper3_Operator;

public class Exercise3_1 {
    public static void main(String[] args) {

        int x = 2;
        int y = 5;
        char c = 'A';

        System.out.println(1 + x << 33); //3<<33, 1번만 쉬프트. 3<<1. 3에 2의 1제곱 곱하면 3*2=6
        System.out.println(y >= 5 || x < 0 && x > 2); //&&먼저 연산 후 || 연산. true
        System.out.println(y += 10 - x++); //10 - x++=8, 5+8=13
        System.out.println(x+=2); //x는 위의 식에서 값이 3이됨. 3+2=5
        System.out.println(!('A' <= c && c <= 'Z')); //false
        System.out.println('C'-c); //67-65=2
        System.out.println('5'-'0'); //53-48=5
        System.out.println(c+1); //66
        System.out.println(++c); //B 단항연산자는 형변환 하지 않음.
        System.out.println(c++); //B
        System.out.println(c); //C
    }
}

