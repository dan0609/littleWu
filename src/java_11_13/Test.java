package java_11_13;

public class Test {
    //创建一个小吴，身高1.54，年龄18，跑路速度3
    //创建一个小殷，身高1.79，年龄18，跑路速度4
    //写一个函数，400m跑的时候某个人的耗时
    //计算小吴和小殷离活到80岁还有多少时间
    //如果身高超过1.7就跑800米，低于就跑400米，计算分别跑的时间

    public static void main(String[] args){
        Human xiaowu = new Human( 18,1.54,3);
        Human xiaoyin = new Human(18,1.79,4);
        if (1 > 2){
            System.out.println("1 > 2");
        }else {
            System.out.println("1 <= 2");
        }
        System.out.println(timeRun(xiaoyin));
    }
    public static double timeRun(Human zhutou){
        double result;
        if (zhutou.getHeight() > 1.7){
            result = 800 / zhutou.getSpeed();
        }else{
            result = 400 / zhutou.getSpeed();
        }
        return result;
    }

}

