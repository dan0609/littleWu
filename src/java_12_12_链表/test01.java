package java_12_12_链表;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class test01 {
    //链表是一种链式数据存储结构，数据以节点形式存在
    //节点包含：数据元素 和 下一节点的位置
    //链表不连续，数组连续，所以链表不能根据索引查询元素
    //要学习：1.创建链表；2.添加链表元素；3.删除链表元素；4.链表的循环
    public static void main(String[] args) {
        //创建链表LinkedList
        LinkedList<Integer> linKInt = new LinkedList<>();
        LinkedList<String> linkStr = new LinkedList<>();
        //添加元素
        linKInt.add(1);
        linKInt.add(2);
        linKInt.add(3);
        linkStr.add("abc");
        System.out.println(linKInt + "添加" + linkStr);
        //删除元素
        linKInt.remove(0);
        System.out.println("删除索引0位置的1 " + linKInt);
        linKInt.remove(new Integer(3));
        System.out.println("删除封装的值3 " + linKInt);
        linkStr.remove("abc");
        System.out.println("删除String " + linkStr);
        //循环打印
        for (int i = 0; i < 4; i++){
            linKInt.add(i);
            System.out.println(linKInt);
        }



    }

}
