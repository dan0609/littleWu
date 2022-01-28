package java_12_21;

import java.util.ArrayList;
import java.util.List;

public class 多线程练习 {
    public static void main(String[] args) {
        //10个线程，一个列表，一分钟内，线程每隔2秒，往列表里插入自己的线程号、时间、和第几次
        List<String> output = new ArrayList<>();
        for (int i = 0; i < 10 ; i++){
            final int name = i;
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0 ; j < 30; j ++){
                        output.add("线程名:"+name+",时间:"+(j*2)+",第"+j+"次插入\n");
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
            thread.start();
        }
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(output);
    }

}
