package java_11_15;

public class test {
    public static void main(String[] args){
        //计算器加减乘除运算
        System.out.println(Calculator.add(1,2));
        System.out.println(Calculator.subtraction(2,1));
        System.out.println(Calculator.multiplication(1,3));
        System.out.println(Calculator.division_method(2,0));

        //圆的面积和周长计算
        Circle result = new Circle();
        System.out.println(result.calu_area(4));
        System.out.println(result.calu_perimeter(4));

    }
}
