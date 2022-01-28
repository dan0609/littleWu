package java_11_24;

public class stringtest {
    public static void main(String[] args) {
        //创建字符串
        String str2 = "1234";
        System.out.println(reverseStr(null));
    }
    public static String reverseStr(String input){
        if (input == null){
            return null;
        }
        int length = input.length();
        String result = "";
        for (int i = 0; i < length; i++){
            result += input.charAt(length - 1- i);
        }
        return result;
    }

}
