package Chapter4_조건문반복문;

public class Exercise4_1 {
    public static void main(String[] args) {
        int x = 11;
        char ch = 'z';
        int year = 400;
        boolean powerOn = false;
        String str = "yes";

        //1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
        if(x > 10 && x < 20){
            System.out.println("1: " + true);
        }
        //2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
        if(ch != ' ' && ch != '\t'){
            System.out.println("2: " + true);
        }
        //3. char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식
        if(ch == 'x' || ch =='X'){
            System.out.println("3: " + true);
        }
        //4. char형 변수 ch가 숫자('0'~'9')일 때 true인 조건식
        if('0' <= ch && ch <= '9'){
            System.out.println("4: " + true);
        }
        //5. char형 변수 ch가 영문자(대문자 혹은 소문자)일 때 true인 조건식
        if('a' <= ch && 'z' >= ch || 'A' <= ch && 'Z' >= ch){
            System.out.println("5: " + true);
        }
        //6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을 때 true인 조건식
        if(year%400==0 || year%4==0 && year%100!=0){
            System.out.println("6: " + true);
        }
        //7. boolean형 변수 powerOn이 false일 때 true인 조건식
        if(powerOn == false){
            System.out.println("7: " + true);
        }
        //8. 문자열 참조변수 str이 "yes"일 때 true인 조건식
        if(str.equals("yes")){
            System.out.println("8: " + true);
        }
    }
}
