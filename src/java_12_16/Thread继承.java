package java_12_16;

public class Thread继承 {
    public static void main(String[] args) {
        Thread1 a = new Thread1("A");
        Thread1 b = new Thread1("B");
        a.start();
        b.start();
    }
}
class Thread1 extends Thread{
    private String name;
    public Thread1(String name){
        this.name = name;
    }
    //Thread要有run方法
    public void run(){
        for (int i = 0; i < 5; i++){
            System.out.println(name + "运行 ：" + i);
            try{
                sleep((int)Math.random() * 10);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
