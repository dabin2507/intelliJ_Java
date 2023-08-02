package Chapter4_조건문반복문;

public class Exercise4_3 {
    public static void main(String[] args) {
        int sum = 0;
        int totalSum = 0;
        for(int i = 1; i <= 10; i++){
            sum += i;
            totalSum += sum;
        }
        System.out.println("결과: " + totalSum);
    }
}
//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 구하시오.