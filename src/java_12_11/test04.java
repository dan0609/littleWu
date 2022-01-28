package java_12_11;

public class test04 {
    public static void main(String[] args) {
        String inputArray = "this is a test";
        String target1 = "test";
        String target2 = "is";
        String target3 = "nomarl";
        System.out.println(isTargerExistInString(inputArray,target1));
        System.out.println(isTargerExistInString(inputArray,target2));
        System.out.println(isTargerExistInString(inputArray,target3));
    }
    public static int isTargerExistInString(String inputArray, String target){
        //扩写这里包括返回值
        int countlndex = 0;
        int result = 0;
        for (int j = 0; j < inputArray.length(); j++){
            if (inputArray.charAt(j) == target.charAt(countlndex)){
                countlndex ++;
                if (countlndex == target.length()){
                    result ++;
                    countlndex = 0;
                }
            }else{
                countlndex = 0;
            }
        }
        return result;
    }

}
