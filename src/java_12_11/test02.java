package java_12_11;

public class test02 {
    public static void main(String[] args) {
        String inputStr = "this is a test";
        String target1 = "test";
        String target2 = "normal";
        System.out.println(isTargerExistInString(inputStr,target1));
        System.out.println(isTargerExistInString(inputStr,target2));
    }
    public static boolean isTargerExistInString(String inputArray, String target){
        if (target == null || target.length() == 0){
            return false;
        }
        if (inputArray == null || inputArray.length() == 0){
            return false;
        }
        if (inputArray.length()<target.length()){
            return false;
        }
        int compareIndex = 0;
        //扩写这里包括返回值
        for (int i = 0; i < inputArray.length();i++){
            if (inputArray.charAt(i) == target.charAt(compareIndex)){
                compareIndex ++;
                if (compareIndex == target.length()){
                    return true;
                }
            }else {
                compareIndex = 0;
            }
        }
        return false;
    }

    public static boolean isTargerExistInString2(String inputArray, String target){
        if (target == null || target.length() == 0){
            return false;
        }
        if (inputArray == null || inputArray.length() == 0){
            return false;
        }
        if (inputArray.length()<target.length()){
            return false;
        }
        int result = compareResult(inputArray, 0, target, 0);
        return result == target.length();
    }

    public static int compareResult(String inputArray, int inputArrayIndex, String target,int targetIndex){
        if (inputArray.charAt(inputArrayIndex) == target.charAt(targetIndex)){
            inputArrayIndex = inputArrayIndex +1;
            targetIndex = targetIndex+1;
            if (targetIndex == target.length() || inputArrayIndex == inputArray.length()){
                return targetIndex;
            }
            return compareResult(inputArray,inputArrayIndex, target, targetIndex);
        }else {
            inputArrayIndex = inputArrayIndex +1;
            targetIndex = 0;
            if (inputArrayIndex == inputArray.length()){
                return targetIndex;
            }
            return compareResult(inputArray, inputArrayIndex,target, targetIndex);
        }
    }

}
