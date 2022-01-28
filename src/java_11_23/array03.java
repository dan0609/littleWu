package java_11_23;

public class array03 {
    //写一个方法，输入一个数组，输出值是这个数组跳一位输出
    // 01234，输出  024
    // 0，输出 0
    public static int[] numarray(int[] inputArray) {
        int length;
        length = (inputArray.length + 1) / 2;
        int[] result = new int[length];
        System.out.println("计算出来的length = " + length);
        for (int i = 0; i < inputArray.length; i += 2) {
            System.out.println("第" + i + "次，result[" + (i / 2) + "] = inputArray[" + i + "]");
            result[i / 2] = inputArray[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] Q1 = new int[]{0,1};
        System.out.println("————————Q1跳数——————");
        int[] Q1result = numarray(Q1);
        for (int i = 0; i < Q1result.length; i++) {
            System.out.println(Q1result[i]);
        }

        int[] Q2 = new int[]{0};

        //申明int数组
        int[] a;
        //初始化数组{0,0,0,0,0,0,0,0,0,0}
        a = new int[10];
        //第二种初始化{1,2,3,4}
        a = new int[]{1,2,3,4};
        //数组的长度
        System.out.println(a.length);
        //给数组第2个值赋值
        a[1] = 1;
    }
}
