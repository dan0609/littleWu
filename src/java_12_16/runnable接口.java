package java_12_16;

public class runnable接口 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                printFor5Times("A");
            }
        }).start();
    }

    public static void printFor5Times(String name){
        for (int i = 0; i < 5; i ++){
            System.out.println(name + "运行 ：" + i );
            try {
                Thread.sleep((int)(Math.random()* 10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
