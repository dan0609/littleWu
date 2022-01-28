package java_11_28;

import java.util.ArrayList;
import java.util.List;

public class leecode58 {
    public static void main(String[] args) {
//        System.out.println(lengthOfLastWord("hello world"));
//        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
//        System.out.println(lengthOfLastWord("luffy is still joyboy"));
        System.out.println(lengthOfLastWord("a"));
    }

    public static int lengthOfLastWord(String s) {
        List<String> tempList = new ArrayList<>();
        for (int i = s.length() - 1; i >= 0; i--){
            if (s.charAt(i) == ' ' && tempList.size() > 0){
                break;
            }
            if (s.charAt(i) != ' ') {
                tempList.add(String.valueOf(s.charAt(i)));
            }
        }
        return tempList.size();
    }
}
