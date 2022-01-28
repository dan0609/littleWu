package java_12_20;

import java.util.ArrayList;
import java.util.List;

public class test链表 {
    //
    public static void main(String[] args) {
        int[] a = new int[]{2,4,3};
        int[] b = new int[]{0};
        System.out.println( addTwoNumbers(a, b));

    }

    public static List addTwoNumbers(int[] input1, int[] input2) {
        int input1result = 0;
        int xishu = 1;
        for (int i = 0; i < input1.length; i++) {
            if (i == 0) {
                input1result = input1[i];
                continue;
            }
            xishu = xishu * 10;
            input1result += input1[i] * xishu;
        }
        System.out.println(input1result);
        int input2result = 0;
        xishu = 1;
        for (int i =0; i < input2.length; i++){
            if (i == 0){
                input2result = input2[i];
                continue;
            }
            xishu = xishu * 10;
            input2result += input2[i] * xishu;
        }
        System.out.println(input2result);
        //求和
        int addresult = input1result + input2result;
        System.out.println(addresult);
        ArrayList<Integer> result = new ArrayList<>();
        if (addresult == 0){
            result.add(0);
            return result;
        }
        while (addresult > 0){
            int shang = addresult % 10;
            result.add(shang);
            addresult /= 10; //除等于的结果是一个整数
        }
        System.out.println("result= " + result);

        return result;
    }
}
