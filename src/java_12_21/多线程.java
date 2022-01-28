package java_12_21;

import java.util.ArrayList;
import java.util.List;

public class 多线程 {
    //10个线程，一分钟内，线程每隔2秒，往列表里插入自己的线程号、时间、和第几次,存在一个列表里
    public static void main(String[] args) {
        //创建10个线程
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 10; i ++){
            final int name = i;
            Thread threads = new Thread(new Runnable() {
                @Override
                public void run() {
                    threadAction(result,name);
                }
            });
            threads.start();
        }
        //等待一分钟程序运行
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //打印结果
        System.out.println(result);

    }
    //线程的方法
    public static void threadAction(List result,int name){
        for(int j= 0; j < 30; j++){
            result.add("线程名：" + name + " 时间：" + (j * 2) + " 第" + j + "次插入\n" );
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
