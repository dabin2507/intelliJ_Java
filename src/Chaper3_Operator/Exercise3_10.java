package Chaper3_Operator;

public class Exercise3_10 {
    public static void main(String[] args) {
        char ch = 'A';

        char lowerCase = ch >= 'A' && ch <= 'Z' ? (char)(ch+32) : ch;

        System.out.println("ch: " + ch);
        System.out.println("ch to lowerCase: " + lowerCase);
    }
}
//ch에 저장된 문자가 대문자인 경우에만 소문자로 변경.
//문자코드는 소문자가 대문자보다 32만큼 더 크다.