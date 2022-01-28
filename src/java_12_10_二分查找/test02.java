package java_12_10_二分查找;

public class test02 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        System.out.println(twoSearch(nums,3));
        System.out.println(twoSearch(nums,6));

    }
    public static int twoSearch(int[] inputNums,int target){
        int left = 0;
        int right = inputNums.length - 1;
        while (left <= right){
            int middle = left + ((right - left) / 2);
            if (target > inputNums[middle]){
                left = middle + 1;
            }else if (target < inputNums[middle]){
                right = middle -1;
            }else{
                return middle;
            }

        }

        return -1;
    }
}
