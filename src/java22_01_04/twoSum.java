package java22_01_04;

import java.util.ArrayList;
import java.util.List;

public class twoSum {
    //给你一个有序数组inputArray, 给你一个数字target，需要从这个数组中找出两个数，其相加的结果等于target，返回这两个数的index列表
    public static void main(String[] args) {
        int[] inputlist = new int[]{2,3,4,6,7,11,15};
        System.out.println(twoSum(inputlist,8));
    }
    //扩写
    public static List<Integer> twoSum(int[] inputArray, int target){
        //扩写这里包括返回值
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++){
            for (int j=0; j < inputArray.length; j ++){
                if ((inputArray[i] + inputArray[j]) == target && i < j ){
                    result.add(inputArray[i]);
                    result.add(inputArray[j]);
                }
            }
        }

        return result;
    }

}
