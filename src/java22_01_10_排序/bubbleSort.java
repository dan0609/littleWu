package java22_01_10_排序;

import java.util.ArrayList;
import java.util.List;

public class bubbleSort {
    public static void main(String[] args) {
        int[] a = new int[]{1,3,2,5,6,4,8,7};
        System.out.println(bubbleSort(a));
    }
    public static List bubbleSort(int[] nums){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i=0; i < nums.length; i++){
            for(int j=0; j < nums.length-1-i; j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            result.add(nums[i]);
        }
        return result;
    }

}
