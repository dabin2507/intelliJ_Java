package Chaper3_Operator;

import org.w3c.dom.ls.LSOutput;

public class Exercise3_2 {
    public static void main(String[] args) {
        int numOfApples = 123; //사과의 개수
        int sizeOfBucket = 10; //바구니의 크기(바구니에 담을 수 있는 사과의 개수)
        int numOfBucket = numOfApples/sizeOfBucket;//모든 사과를 담는데 필요한 바구니의 수
        // numOfApples / sizeOfBucket 했을 때 나머지가 0이면 그대로, 나머지가 있으면 +1을 한다.
        if(numOfApples%sizeOfBucket>0){
            numOfBucket += 1;
            System.out.println("필요한 바구니의 수 : " + numOfBucket);
        }
    }
}
