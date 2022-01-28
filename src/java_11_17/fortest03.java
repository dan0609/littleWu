package java_11_17;

public class fortest03 {
    public static void main(String[] args){
        //输入1-10的奇数
        for (int i=1; i<10; i+=2){
            System.out.println("奇数i=  "+i);
        }
        //输入1-10的偶数
        for (int i=2; i<=10; i+=2){
            System.out.println("偶数i= "+i);
        }
        //10以下依次递减
        for (int i=10; i>=0 ; i--){
            System.out.println(i);
        }
    }

}
