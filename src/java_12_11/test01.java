package java_12_11;

public class test01 {
    public static void main(String[] args) {
        String inputStr = "this is a test";
        String target1 = "test";
        String target2 = "normal";
        System.out.println(strContains(inputStr,target1));
        System.out.println(strContains(inputStr,target2));
        System.out.println(strIndexOF(inputStr,target1));
        System.out.println(strIndexOF(inputStr,target2));
    }
    public static boolean strContains(String inputArray, String target){
        //判断包含值，contains方法
        boolean status = inputArray.contains(target);
        return status;
    }
    public static  boolean strIndexOF(String inputArray, String target){
        //判断包含位置，indexOf方法
        int result = inputArray.indexOf(target);
        if (result != -1){
            return true;
        }
        return false;

    }

}
