package java22_01_10_排序;

public class shopee {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,4,5,3};
        System.out.println("找最大的数字 "+methodBig(a));
        System.out.println("找第二大的数字 "+secondBiggest(a));
    }
    //先找最大的数
    public static int methodBig(int[] inputArray){
        if (inputArray == null || inputArray.length <= 0){
            return -1;
        }
        int biggest = inputArray[0];
        for(int i=1; i < inputArray.length; i++){
            if(inputArray[i] > biggest){
                biggest = inputArray[i];
            }
        }
        return biggest;
    }
    //找第二大的数
    public static int secondBiggest(int[] nums){
        if (nums == null || nums.length <= 1){
            return -1;
        }
        //按大小将头两个数分别赋值给第一大，和第二大
        int biggest = 0;
        int secondbig = 0;
        if(nums[0]>= nums[1]){
            biggest = nums[0];
            secondbig = nums[1];
        }else{
            biggest = nums[1];
            secondbig = nums[0];
        }
        //从第三个数开始循环，如果比biggest大，则最大值更新，原最大值赋给第二大值
        //如果该元素不大于最大值，且大于第二大的值，则第二大的值更新
        for(int i=3; i< nums.length; i++){
            if (nums[i]> biggest){
                secondbig = biggest;
                biggest = nums[i];
            }
            else if(nums[i] > secondbig){
                secondbig = nums[i];

            }
        }
        return secondbig;

    }
}
