package java_12_10_二分查找;

public class test01 {

    //二分查找的要求：去重且有序的数组
    public static int search(int num[],int size,int target){
        int left = 0;
        int right = size - 1; //定义了target在左闭右闭的区间内，[left, right]
        while(left <= right){ //最左边要小于等于最右边，不然没有目标值跳出循环
            int middle = left + ((right - left) / 2); //等同于（left + right] / 2，防止溢出，middle是索引值
            if(num[middle] > target){
                right = middle - 1; //target在左区间，右边的排除，中间值也排除所以-1，此时target在[left,middle-1]
            }else if(num[middle] < target){
                left = middle + 1; //target在右区间，左边排除，此时target在[middle+1,right]
            }else{
                return middle;
            }

        }

        return -1;
    }
}
