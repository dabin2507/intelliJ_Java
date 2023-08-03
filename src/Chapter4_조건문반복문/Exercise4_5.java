package Chapter4_조건문반복문;

public class Exercise4_5 {
    public static void main(String[] args) {
        int i = 0;
        while(i<=10){
            int j = 0;
            while(j<=i){
                System.out.println("*");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
//for(int i=0; i<=10; i++){
// for(int j=0; j<=i; j++){
// System.out.print("*");
// System.out.print();
// }
// }