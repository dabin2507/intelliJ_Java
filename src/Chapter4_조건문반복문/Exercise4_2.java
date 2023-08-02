package Chapter4_조건문반복문;

public class Exercise4_2 {
    public static void main(String[] args) {
        int sum = 0;
        for(int a = 1; a <=20; a++){
            if(a%2!=0 && a%3!=0){
                sum += a;
            }
        }
        System.out.println("총합: " + sum);
    }
}
//1부터 20까지의 정수중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.