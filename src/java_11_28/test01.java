package java_11_28;

import java.util.ArrayList;
import java.util.List;

public class test01 {
    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        input.add("n");
        input.add("o");
        input.add("o");
        input.add("m");
        System.out.println("原来的列表" + input);
        System.out.println("倒过来"+listreverse(input));
    }

    public static  List<String> listreverse(List<String> input){
        List<String> result = new ArrayList<>();
        for (int i = input.size() - 1; i>=0 ; i--){
            result.add(input.get(i));
        }
        return result;
    }

}
