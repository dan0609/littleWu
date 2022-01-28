package java_12_18;

import java.util.ArrayList;

public class 多线程runnable {
    //主线程和子线程分别打印时间
    public static void main(String[] args) {
        //子线程打印
        newThread(10);
        //主线程打印,一般不用
        threadAction("主线程");
    }
    //线程的方法
    public static void threadAction(String name){
        System.out.println("线程号 " + Thread.currentThread().getId() + " " + name + " 开始打印时间 ：" + System.currentTimeMillis());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程号 " + Thread.currentThread().getId() + " " + name + " 结束打印时间 ：" + System.currentTimeMillis());
    }
    //创建100个线程
    public static void newThread(int threadNum){
        ArrayList<Thread> threadlist = new ArrayList<>();
       for (int i = 0; i < threadNum; i++){
           Thread thread = new Thread(new Runnable() {
               @Override
               public void run() {
                   threadAction("子线程");
               }
           });
//           System.out.println("id = "+thread.getId());
           threadlist.add(thread);
       }
       for (int i = 0; i < threadlist.size(); i ++){
           threadlist.get(i).start();
       }

    }
}
