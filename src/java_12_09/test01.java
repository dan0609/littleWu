package java_12_09;

public class test01 {
    //给你一个数组，外加一个目标值，返回这个值在这个数组里面出现了多少次
    public static void main(String[] args) {
        int[] input1 = new int[]{2,3,1,4,5,1,3,3,3,3};
        System.out.println(countsInArray(input1,3));

    }
    public static int countsInArray(int[] inputArray, int target){
        //扩写这里包括返回值
        if (inputArray == null ){
            return 0;
        }
        int result = 0;
        for(int i = 0; i < inputArray.length; i++){
            if (target == inputArray[i]){
                result += 1;
                System.out.println( "result= " + result );
            }
        }
        return result;
    }

}
