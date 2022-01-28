package java_11_14;

public class test {
    public static void main(String[] args){
        Human xiaowu = new Human(18,1.55,3);
        Human xiaoyin = new Human(101,3,11);
        Human zhutou = new Human(18,1.8);

        System.out.println(""+xiaowu.getAge()+","+xiaowu.getSpeed()+","+xiaowu.getHeight());
        System.out.println(""+xiaoyin.getAge()+","+xiaoyin.getSpeed()+","+xiaoyin.getHeight());

        System.out.println(xiaowu.time80());
        System.out.println(xiaowu.time_n(400));

    }
}
