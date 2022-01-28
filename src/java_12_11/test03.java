package java_12_11;

public class test03 {
    public static void main(String[] args) {
        String inputStr = "this is a test";
        String target1 = "test";
        String target2 = "normal";
        System.out.println(isTargerExistInString(inputStr,target1));
        System.out.println(isTargerExistInString(inputStr,target2));
    }
    public static boolean isTargerExistInString(String inputArray, String target){
        //扩写这里包括返回值
        if (inputArray == null){
            return false;
        }
        int count = 0;
        for (int i = 0; i < inputArray.length(); i++){
            if (inputArray.charAt(i) == target.charAt(count)){
                count ++;
                if (count == target.length()){
                    return true;
                }
            }
            else{
                count = 0;
            }
        }


        return false;
    }

}
