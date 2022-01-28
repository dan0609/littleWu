package java_11_30_排序;

import java.util.ArrayList;
import java.util.List;

public class test01 {
    //把一个字符串倒着输出，"abc"输出"cba"
    //for循环取值的范围 【0，input.length() - 1】
    //正着循环就是 （int i=0; i <= input.length() -1; i++）
    //倒着循环就是 （int i=input.length() - 1; i >= 0; i--）
    public static void main(String[] args) {
        System.out.println(strTest("abc"));
        System.out.println(strTest(""));
        System.out.println(strTest(null));

    }
    public static String strTest(String input){
        if (input == null){
            return null;
        }
        //创建一个list用来存储
        List<String> list = new ArrayList<>();
       // [0,input.length() -1]
        for (int i = input.length() - 1; i >= 0; i--){
            list.add(String.valueOf(input.charAt(i)));
            System.out.println("list此时的i等于" + i + "list等于 " + list);
        }
        //创建一个字符串
        String result = "";
        for (int i = 0; i <= list.size() - 1; i++){
            result += list.get(i);
            System.out.println("result此时的i等于 " + i);
        }
        return result;
    }


}
