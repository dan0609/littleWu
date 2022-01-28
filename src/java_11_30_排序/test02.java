package java_11_30_排序;

public class test02 {

    public static String reverseWord(String input){
        if (input == null || input.length() == 0){
            return input;
        }
        StringBuilder result = new StringBuilder();
        for (int i = input.length() -1 ; i >= 0 ; i--){
            result.append(input.charAt(i));
        }

        return result.toString();
    }
    //刚才的题目 "abc" -> "cba"
    //现在的题目 "this  is abc " -> "siht si cba";
    public static String reverse(String input){
        if (input == null || input.length() == 0){
            return input;
        }
        StringBuilder result = new StringBuilder();
        StringBuilder tempContainer = new StringBuilder();
        for (int i = 0; i <= input.length() - 1; i ++){
            if (input.charAt(i) == ' '){
                if (tempContainer.length() > 0){
                    result.append(reverseWord(tempContainer.toString()));
                    tempContainer = new StringBuilder();//
                }
                result.append(' ');
            }else {
                tempContainer.append(input.charAt(i));
            }
        }
        return result.toString();
    }

}
