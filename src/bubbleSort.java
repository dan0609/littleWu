import utils.ArrayUtils;

public class bubbleSort {
    public static void main(String[] args) {
        int[] input1 = new int[]{10,9,8,7,6,5,4,3,2,1};
        String result1 = ArrayUtils.convertArrayToString(bubbleSort(input1));
//        String result1 = ArrayUtils.convertArrayToString(selectSort(input1));
        System.out.println(result1);
//        int[] input2 = new int[]{0,-1,2,-2,3,-4};
//        System.out.println(ArrayUtils.convertArrayToString(bubleSort(input2)));
    }
    public static int[] selectSort(int[] input){
        int count = 0;
        for (int i=0; i < input.length; i++){
            for (int j=i; j < input.length; j++){
                System.out.println("i = "+i+", j " +
                        "= "+j+"排序前"+ArrayUtils.convertArrayToString(input));
                if (input[i] > input[j]){
                    int t = input[j];
                    input[j] = input[i];
                    input[i] = t;
                }
                System.out.println("i = "+i+", j = "+j+"排序后"+ArrayUtils.convertArrayToString(input));
                System.out.println("--------------------------------------------");
                count ++;
            }
        }
        System.out.println("比较次数"+count);
        return input;
    }

    public static int[] bubbleSort(int[] input){
        int count = 0;
        for(int i = 0; i < input.length; i ++){
            for (int j = 0; j < input.length -1; j ++){
                System.out.println("i = "+i+", j = "+j+"排序前"+ArrayUtils.convertArrayToString(input));
                if (input[j] > input[j + 1]){
                    input[j] = input[j] + input[j + 1];
                    input[j+1] = input[j] - input[j+1];
                    input[j] = input[j] - input[j + 1];
                }
                System.out.println("i = "+i+", j = "+j+"排序后"+ArrayUtils.convertArrayToString(input));
                System.out.println("--------------------------------------------");
                count ++;
            }
        }
        System.out.println("比较次数"+count);
        return input;
    }
}
