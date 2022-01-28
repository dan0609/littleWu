package java_11_29;

import java.util.ArrayList;
import java.util.List;

public class test01 {
    //输入是两个字符串，函数功能是判断这两个字符串是否内容相等，返回值就是是否相等
    public static void main(String[] args) {
//        System.out.println(equals("abc123","abc124"));
        System.out.println(isHead("abc123","abc"));
        System.out.println(isHead("abc123","abc121"));
    }
//    public static boolean equals(String input1,String input2){
//        if (input1 == input2){
//            return true;
//        }
//        return false;
//    }

    public static boolean isHead(String input1, String input2){
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        for (int i = 0; i < input1.length(); i++){
            list1.add(String.valueOf(input1.charAt(i)));
        }
        System.out.println("输出list1 " +list1);
        for (int i = 0; i < input2.length(); i++){
            list2.add(String.valueOf(input2.charAt(i)));
        }
        System.out.println("输出list2 " +list2);
        for (int i = 0; i <list2.size() && i < list1.size(); i++){
            if(list1.get(i).equals(list2.get(i))){
                continue;
            }else{
                return false;
            }
        }

       return true;
    }
}
