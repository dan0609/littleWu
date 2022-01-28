package java_12_15;

import java.util.ArrayList;
import java.util.List;

public class test01 {
    public static void main(String[] args) {
        int[] input1 = new int[]{2,7,11,15};
        System.out.println(twoSum(input1,9));
    }
    public  static  List<Integer> twoSum(int[] inputArray, int target){
        //扩写这里包括返回值
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++){
            for (int j = 0; j < inputArray.length; j++){
                if ((inputArray[i] + inputArray[j]) == target && i != j){
                    result.add(inputArray[i]);
                    result.add(inputArray[j]);
                    return result;
                }
            }
        }

        return null;
    }

}
