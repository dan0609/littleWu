package java_11_24;

import java.util.ArrayList;
import java.util.List;

public class String3 {
    //字符串"1234"，变成数组[1，2，3，4]

    //"1234" -> ["1","2","3","4"]

    public static List<String> strData2(String input){
        if (input == null)
            return null;
        List<String> result = new ArrayList<>();
        for (int i = 0; i < input.length(); i ++){
            result.add(String.valueOf(input.charAt(i)));
        }
        return result;
    }

    public static  int[] strdata1(String input) {
        if (input == null){
            return null;
        }
        int[] result = new int[input.length()];
        int lenth = input.length();
        for (int i=0;i<lenth;i++){
            result[i] = input.charAt(i) - '0';
        }
        return result;
    }

    public static void main(String[] args) {
        int[] data = strdata1("3456");
        List<String> data2 = strData2("3456");
//        for (int i=0;i< data.length;i++){
//            System.out.println(data[i]);
//        }
        System.out.println(data2);

    }
    //"1234" -> ['1','2','3','4']



}
