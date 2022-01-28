package java_11_16;

public class Str_13 {

    //罗马数字转整数

   public static int romanToInt(String s){
      if (s == null || s.length() == 0){
          return 0;
      }else if (s.length() == 1){
          return romanCharToInt(s.charAt(0)); //从char里面第0位开始
      }else if (s.length() == 3 && s == s ){  //3个同样的罗马数字
          return romanCharToInt(s.charAt(0)) + romanCharToInt(s.charAt(0)) +romanCharToInt(s.charAt(0));
      }else{
          return -1;
      }
   }

    private static int romanCharToInt(char i){
        switch(i){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }



    public static void main(String[] args){
        System.out.println(romanToInt("I"));
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("VI"));
        System.out.println(romanToInt("IX"));
    }
}
