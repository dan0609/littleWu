package java_11_12;

public class Test {
    public static void main(String[] args) {
        System.out.println(useXiaowuToMulti(30,35));
        System.out.println(useXiaowuToDivision(60,30));
    }

    public static int useXiaowuToMulti(int a, int b){
        Son xiaowu = new Son();
        int result = xiaowu.multi(a,b);
        System.out.println(xiaowu.getAge());
        return result;
    }

    public static int useXiaowuToDivision(int a, int b ){
        Son xiaowu = new Son();
        int result = xiaowu.division(a,b);
        return result;
    }
}