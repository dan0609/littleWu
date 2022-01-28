package java_11_17;

public class fortest2 {
    public static void loopTest(String s){
        for (int i = s.length() -1;i>0
                ;i--){
            System.out.println("i = "+i+",length = "+s.length() +", char = "+s.charAt(i));
        }

    }
    public static void main(String[] args){
        loopTest("xiaoyinshizhutou");
    }
}
