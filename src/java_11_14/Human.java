package java_11_14;

//年龄1-100之间，速度2-10，身高1-2之间，超过用最大值,不足用最小值
//如果身高超过1.7就跑800米，低于就跑400米,写个方法，判断这个人是跑400米还是800米
//写个方法，活到80岁需要的时间
//写个方法，跑N米需要的时间
public class Human {
    private int age;
    private double height;
    private int speed;
    public static final int SPEED_DEFAULT = 3;
    public static final double HEIGHT_DEFAULT = 1.7;

    public Human(int age){
        init(age,HEIGHT_DEFAULT,SPEED_DEFAULT);
    }

    public Human(int age, double height){
        init(age, height, SPEED_DEFAULT);
    }

    public Human(int age, double height, int speed){
        init(age, height, speed);
    }



    private void init(int age, double height, int speed) {
        if (age > 100) {
            this.age = 100;
        } else if (age < 1) {
            this.age = 1;
        } else {
            this.age = age;
        }

        if (height > 2) {
            this.height = 2;
        } else if (height < 1) {
            this.height = 1;
        } else {
            this.height = height;
        }

        if (speed > 10) {
            this.speed = 10;
        } else if (speed < 2) {
            this.speed = 2;
        } else {
            this.speed = speed;
        }

    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean canRun400(){
        return height < 1.7;

    }

    public boolean canRun800(){
        return !canRun400();

    }
    public int time80(){
        return 80 - age;
    }
    public double time_n(double n){
        return n / speed;
    }


}

