package java_11_15;

public class Circle {
    //成员变量
    private  double π = 3.14;
    //构造器
   public Circle(){
   }
    //方法一：根据半径计算圆的面积
    public   double calu_area(double radius){
        return π * radius * radius;
    }
    //方法二：根据半径计算圆的周长
    public   double calu_perimeter(double radius){
       return 2 * π * radius;

    }

}
