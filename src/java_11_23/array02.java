package java_11_23;

import com.sun.tools.corba.se.idl.constExpr.GreaterEqual;

public class array02 {
    //写一个方法，输入值是一个数组，输出值是这个数组的反过来

    public static int[] reverse(int[] inputArray){
        int[] result = new int[inputArray.length];
        for (int i=0; i < inputArray.length; i++){
            result[i] = inputArray[inputArray.length -1 -i];
        }
        return result;
    }

    public static void main(String[] args){
        int[] Q1 = new int[]{0,1,2,3,4};
        int[] Q2 = new int[3];
        System.out.println("------q1翻转-----");
        int[] Q1reverse = reverse(Q1);
        for (int i=0;i< Q1reverse.length;i++){
            System.out.println("Q1Reverse 第"+i+"个是"+Q1reverse[i]);
        }
        System.out.println("------q2翻转-----");
        int[] Q2reverse = reverse(Q2);
        for (int i=0; i < Q2reverse.length; i++){
            System.out.println("Q2reverse 第"+ i+"个是"+Q2reverse[i]);
        }



    }

}
