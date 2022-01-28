package java_12_15;

import java.util.ArrayList;
import java.util.List;

public class test02 {
    public static void main(String[] args) {
        int[] input1 = new int[]{2,3,6,7,11,15};
        System.out.println(twoSum(input1,9));
    }

    public static List<List> twoSum(int[] inputArray, int target){
        //两数相加
        ArrayList<List> resultlist = new ArrayList<>();
        for (int i = 0; i < inputArray.length; i ++) {
            for (int j = 0; j < inputArray.length; j++) {
                ArrayList<Integer> result = new ArrayList<>();
                if ((inputArray[i] + inputArray[j]) == target && i != j && i < j) {
                    result.add(inputArray[i]);
                    result.add(inputArray[j]);
                    System.out.println("result的值是 " +result);
                    resultlist.add(result);
                }
            }

        }

        return resultlist;
    }

}
