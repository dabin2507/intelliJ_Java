package Chaper3_Operator;

public class Exercise3_8 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b);
        //int보다 작은 타입은 int로 자동변환한다. 변수 a, b는 모두 byte타입으로 이항연산인 덧셈연산을 하기 전에 int타입으로 자동형변환된다.
        //int와 int의 덧셈으로 결과는 int가 된다. int타입의 값을 byte값으로 담아야 함으로 형변환을 해주어야 한다.

        char ch = 'A';
        ch =(char) (ch + 2);
        //char타입이 덧셈연산과정을 거치면서 int로 변환되므로 char로 형변환 해주어야 한다.

        float f = 3 / 2f;
        //int와 int의 연산결과는 int기 때문에 3/2는 1이된다. 실수로 결과를 얻고 싶으면 두 피연산자 중 한쪽이 실수 타입이어야 한다.
        long l = 3000 * 3000 * 3000l;
        //int*int*int=int이므로 int타입의 최대값이 넘는 오버프로우가 발생하여 예상한 것과는 다른 값을 얻는다.
        //그래서 연산자 중 적어도 하나는 long타입이어야 최종 결과를 long타입으로 얻을 수 있다.

        float f2 = 0.1f;
        double d = 0.1f;

        boolean result = d==f2;
        //double과 float의 연산은 double과 double연산으로 자동형변환된다.
        //double값을 유효자리수가 적은 float로 형변환해서 비교하는 것이 정확한 결과를 얻는다.

        System.out.println("c= " + c);
        System.out.println("ch= " + ch);
        System.out.println("f= " + f);
        System.out.println("l= " + l);
        System.out.println("result= " + result);
    }
}
