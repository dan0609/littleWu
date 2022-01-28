package java_12_12_链表;

import java.util.ArrayList;
import java.util.LinkedList;

public class test02 {

    public static int[] addArray(int[] inputA, int[] inputB) {
        //扩写这里包括返回
        float multiNumber = 0.1f;
        int countA = 0;
        for (int i = 0; i < inputA.length; i++){
            multiNumber *= 10;
            countA += inputA[i] * multiNumber;
        }
        System.out.println("countA = "+countA);

       int countB = 0;
       multiNumber = 0.1f;
       for (int i = 0; i < inputB.length; i++){
           multiNumber *= 10;
           countB += inputB[i] * multiNumber;
       }
        System.out.println("countB = " + countB);
       int sumAB = countA + countB;
        System.out.println("a和b相加= " + sumAB);

        ArrayList<Integer> result = new ArrayList<>();
        while (sumAB > 0 ){
            int shang = sumAB % 10;
            result.add(shang);
            sumAB /= 10;
        }
        System.out.println("result = "+result);



        return null;
    }

    public static void main(String[] args) {
        addArray(new int[]{1,2,3}, new int[]{9,8,7});
    }

}
