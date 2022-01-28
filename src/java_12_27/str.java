package java_12_27;

import java.util.ArrayList;

public class str {
    //输入字符串1：I have a student ; 输入字符串2：aeiou ;
    //处理：在字符串1中，将字符串2的字母删掉；输出： i hv stdnt
    public static void main(String[] args) {
        String A = new String("I have a student");
        String B = new String("aeiou");
        System.out.println(foo(A,B));

    }
    public static String cutstr(String input1, String input2){
        String result = new String();
        ArrayList<Character> resultlist = new ArrayList<>();
        ArrayList<Character> input1charList = new ArrayList<>();
        for (int i = 0; i < input1.length(); i++){
            input1charList.add(input1.charAt(i));
        }
        ArrayList<Character> input2charlist = new ArrayList<>();
        for (int i = 0; i < input2.length(); i ++){
            input2charlist.add(input2.charAt(i));
        }
        //对比，存到结果列表里
        for (int i = 0 ; i < input1charList.size(); i++){
            //声明一个标记位
            boolean flag = false;
            for (int j = 0; j < input2charlist.size();j++){
                if (input1charList.get(i) == input2charlist.get(j)){
                    flag = true;
                }
            }
            if (flag == false){
                resultlist.add(input1charList.get(i));
            }
        }
        //转为String类型输出
        for(int i = 0; i < resultlist.size(); i++){
            result += resultlist.get(i);
        }

        return result;
    }

    public static String foo(String inputA, String inputB){
        String result = "";
        if (inputA == null || inputB == null || inputA.length() == 0 || inputB.length() == 0){
            return "";
        }
        for (int i = 0; i < inputA.length(); i ++){
            char thisChar = inputA.charAt(i);
            boolean flagContain = false;
            for (int j = 0; j < inputB.length(); j++){
                if (thisChar == inputB.charAt(j)){
                    flagContain = true;
                    break;
                }
            }
            if (!flagContain){
                result += String.valueOf(thisChar);
            }
        }
        return result;
    }

}
