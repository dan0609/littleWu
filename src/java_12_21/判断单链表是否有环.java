package java_12_21;

public class 判断单链表是否有环 {
    public boolean hasCycle(ListNode head){
        if (head.next == null){
            return false;
        }
        ListNode fastNode = head;
        ListNode slowNode = head;
        while (fastNode != null){
            if (fastNode.next != null){
                fastNode = fastNode.next.next;
            }else {
                fastNode = null;
            }
            slowNode = slowNode.next;
            if (slowNode == fastNode){
                return true;
            }
        }

        return false;
    }

}
