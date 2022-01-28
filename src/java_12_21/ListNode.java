package java_12_21;

public class ListNode {
    //两种数据类型，值和下一节点
    int val;
    ListNode next;
    //三总构造方式
    ListNode(){};
    ListNode(int val){this.val = val;}
    ListNode(int val, ListNode next){this.val = val; this.next = next;}
}
