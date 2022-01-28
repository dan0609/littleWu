package java_11_16;

import java_11_13.Human;

public class loop {
    public static void loopString(String s){
        if (s == null){
            return;
        }
        int length = s.length();
        for (int i = 0; i < length; i++){
            System.out.println(s.charAt(i));
        }
    }

    public static void main(String[] args) {
        loopString("xiaowudabendan");
    }
}
