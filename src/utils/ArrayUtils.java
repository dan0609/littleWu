package utils;

public class ArrayUtils {
    public static String convertArrayToString(int[] input){
        //[1,2,3,4]
        String result = "[";
        for (int i=0; i< input.length; i++){
            result += ""+input[i]+(i == input.length - 1 ? "":",");
        }
        result += "]";
        return result;
    }
}
