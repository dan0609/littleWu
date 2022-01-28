package java22_01_04;

import java.util.ArrayList;

public class arraylist {
    //给你一个数组inputA，一个数组inputB，每个数组都有N个个位数。数组中第一个数表示数字的个位，第二个数表示十位，第三个数表示百位。
    // 将其视为数字进行相加，并输出结果数组
    //inputA：[1,2,3],inputB:  [9,8,7]
    //inputA表示321，inputB表示789，其相加的结果是1110，因此输出结果为[0,1,1,1]
    public static void main(String[] args) {
        int[] input1 = new int[]{1,2,3};
        int[] input2 = new int[]{9,8,7};
        System.out.println(intList(input1,input2));

    }
    public static int[] intList(int[] inputA, int[] inputB){
        //先求inputA的结果
        int inputASum = 0;
        float flag = 0.1f;
        for (int i = 0; i < inputA.length; i ++){
            flag *= 10;
            inputASum += inputA[i] * flag;
        }
        System.out.println("inputA相加= "+inputASum);
        //求inputB的值
        int inputBSum = 0;
        flag = 0.1f;
        for (int i= 0; i < inputB.length; i ++){
            flag *= 10;
            inputBSum += inputB[i] * flag;
        }
        System.out.println("inputB相加= " + inputBSum);
        //相加
        int inputAB = inputASum + inputBSum;
        System.out.println("AB的和"+inputAB);
        ArrayList<Integer> resultList = new ArrayList<>();
        while(inputAB>0){
            int yushu = inputAB % 10;
            resultList.add(yushu);
            System.out.println("余数=" + yushu);
            inputAB /= 10;

        }
        System.out.println("resultlist="+resultList);
        int[] result = new int[resultList.size()];
        for (int i=0; i < resultList.size(); i++){
            result[i] = resultList.get(i);
        }


        return result;
    }
}
