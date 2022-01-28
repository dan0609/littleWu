package java_字符串;

import java_12_18.多线程runnable;

import java.util.ArrayList;
import java.util.List;

public class huiwen125 {
    public static void main(String[] args) {
        String a = "A man, a plan, a canal: Panam";
        System.out.println(isPalindrome(a));

    }
    public static boolean isPalindrome(String s) {
        if (s == null){
            return false;
        }
        ArrayList<Character> resolveList = new ArrayList<>();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++){
            if ((s.charAt(i) >= 'a' && s.charAt(i)<='z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                resolveList.add(s.charAt(i));
            }
        }
        System.out.println("处理完的字符串"+resolveList);
        int left = 0;
        int right = resolveList.size() -1;
        for (int i=0; i < resolveList.size(); i++){
          if (left > right){
              break;
          }
          if (resolveList.get(left) != resolveList.get(right)){
              return false;
          }
        }
        return true;
    }
}
