package java22_0117_递归;

public class recursion {

    public static void main(String[] args) {
        //斐波那契数列
        System.out.println(recursion(7));
    }
    public static int recursion(int n){
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 1;
        }

        return recursion(n-1) + recursion(n-2);
    }
}
