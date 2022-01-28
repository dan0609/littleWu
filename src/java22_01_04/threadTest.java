package java22_01_04;

import java.util.ArrayList;

public class threadTest {
    //运行线程,主线程和子线程每隔两秒分别打印时间
    public static void main(String[] args) {
        //主线程运行
        threadAction("主线程");
        //子线程运行
        creatTread(10);

    }

    //线程的方法
    public static void threadAction(String name){
        System.out.println(name + Thread.currentThread().getId()+ " 开始打印时间 ：" +System.currentTimeMillis());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + Thread.currentThread().getId() + " 结束打印时间 ：" + System.currentTimeMillis());

    }

    //创建线程的方法
    public static void creatTread(int nums){
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i= 0; i < nums; i++){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    threadAction("子线程");
                }
            });
            threads.add(thread);
        }
        //创建好了运行
        for (int i = 0; i < threads.size(); i++){
            threads.get(i).start();
        }
    }
}
