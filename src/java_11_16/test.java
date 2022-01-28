package java_11_16;

public class test {
    public static  void loopTest(String s) {
        if (s.length() == 0) {
            return;
        }
        int length = s.length();
        for (int i = 0; i < length; i++) {
            System.out.println(s.charAt(i));
        }
    }

    public static void main(String[] args){
        loopTest("yinpengchengshizhu");
    }
}
