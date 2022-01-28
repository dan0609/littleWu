package java22_01_10_排序;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class quickSort {
    public static void main(String[] args) {
        int[] testArray = new int[]{2,1,4,2,5,4};//1,2,2,4,4,5
        quickSort(testArray);
        System.out.println(Arrays.toString(testArray));
    }


    public static void quickSort(int[] inputArray){
        if (inputArray == null || inputArray.length <= 1){
            return;
        }
        quickSortStep2(inputArray, 0, inputArray.length- 1);
    }


    public static void quickSortStep2(int[] inputArray, int left, int right){
        if (left >= right){
            return ;
        }
        //第一步找到一个位置，其左边比他小，右边比他大
        int position = getTargetPosition(inputArray, left, right);
        //第二步，对[0，position)重复执行quickSort
        System.out.println("left = "+left+",right = "+right+",position = "+position);
        quickSortStep2(inputArray, left, position -1);
        quickSortStep2(inputArray, position +1, right);
    }

    //将最左边的值作为锚点，下面这个函数将最左边的值挪到一个位置，这个位置的左侧比他小，右侧比他大
    public static int getTargetPosition(int[] inputArray, int start, int end){
        int left = start;
        int right = end;
        int target = inputArray[start];
        while (left != right){
            while (left < right && inputArray[left] <= target){
                left ++;
            }
            while (left < right && inputArray[right] > target){
                right --;
            }
            if (left < right) {
                int temp = inputArray[left];
                inputArray[left] = inputArray[right];
                inputArray[right] = temp;
            }
        }
        inputArray[start] = inputArray[left];
        inputArray[left] = target;
        return left;
    }


}
