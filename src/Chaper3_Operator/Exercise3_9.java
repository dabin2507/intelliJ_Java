package Chaper3_Operator;

public class Exercise3_9 {
    public static void main(String[] args) {
        char ch = 'z';
        boolean b = (('A' <= ch && 'Z' >= ch) || 'a' <= ch && 'z' >= ch) || ('0' <= ch && '9' >= ch);

        System.out.println(b);
    }
}
//ch가 영문자(대문자 혹은 소문자)이거나 숫자일 때만 b의 변수 값의 true가 되도록.