package java_11_30_排序;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class test03 {
    //输入一个数组【】，要求去重并排序
    public static void main(String[] args) {
        int[] bbb = new int[]{1,5,4,1,3,4,2,1};
        int[] result = deSort2(bbb);
        for (int i = 0; i < result.length; i ++){
            System.out.println(result[i]);
        }



    }

    public static boolean contain(int target, int[] input, int start, int end){
        for (int i = start; i < end; i ++){
            if (target == input[i]){
                return true;
            }
        }
        return false;
    }

    public static int[] deSort(int[] input){
        //先去重
        ArrayList<Integer> input_new = new ArrayList<>();
        for (int i = 0; i < input.length; i++){
            //原来的去重方式
            if (!contain(input[i], input,i+1, input.length)){
                System.out.println("i = "+i+",input[i] = "+input[i]+",this is not duplicate");
                input_new.add(input[i]);
                System.out.println("after add list is "+input_new);
            }else {
                System.out.println("i = "+i +",input[i] = "+input[i]+", this is duplicate");
            }
        }
        //再排序
        for (int i = 0; i < input_new.size(); i++){
            for (int j = i; j < input_new.size(); j++){
                if (input_new.get(i) > input_new.get(j)){
                    int t = input_new.get(j);
                    input_new.set(j,input_new.get(i));
                    input_new.set(i,t);
                }
            }
        }
        int[] result = new int[input_new.size()];
        for (int i = 0; i < input_new.size();i ++){
            result[i] = input_new.get(i);
        }
        return result;
    }


    public static int[] deSort2(int[] input){
        //先去重
        HashSet<Integer> input_new2 = new HashSet<>();
        for (int i = 0; i < input.length; i++){
            input_new2.add(input[i]);
        }
        System.out.println("HashSet去重后的input2 " + input_new2);
        //再排序
        ArrayList<Integer> input_new3 = new ArrayList<>(input_new2);
        System.out.println("再转成ArrList的input3" + input_new3);
        for (int i = 0; i < input_new3.size(); i++){
            for (int j = i; j < input_new3.size(); j++){
                if (input_new3.get(i) > input_new3.get(j)){
                    int t = input_new3.get(j);
                    input_new3.set(j,input_new3.get(i));
                    input_new3.set(i,t);
                    System.out.println("i= " +i + ",j= " + j + "此时的input3 " +input_new3);
                }
            }
        }
        int[] result = new int[input_new3.size()];
        for (int i = 0; i < input_new3.size(); i++){
            result[i] = input_new3.get(i);
        }

        return result;
    }
}
