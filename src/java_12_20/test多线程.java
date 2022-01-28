package java_12_20;

import java.util.ArrayList;

public class test多线程 {
    public static void main(String[] args) {
        creatThread(20);

    }
    //子线程方法
    public static void threadAction(String name){
        System.out.println("线程号 " + Thread.currentThread().getId() + " " + name + "开始打印时间：" +System.currentTimeMillis());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程号 " + Thread.currentThread().getId() + name + "结束打印时间：" +System.currentTimeMillis());
    }
    public static void creatThread(int nums){
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i <= nums; i++){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    threadAction(" 每两秒运行 ");
                }
            });
            threads.add(thread);
        }
        //运行
        for (int i = 0; i < threads.size(); i++){
            threads.get(i).start();
        }
    }

}
