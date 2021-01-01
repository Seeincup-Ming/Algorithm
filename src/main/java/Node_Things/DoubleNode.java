package Node_Things;

public class DoubleNode<T> {
    public T value;
    public DoubleNode<T> next;
    public DoubleNode<T> last;
    public DoubleNode(T value){
        this.value = value;
    }

    public static class DoubleEndsQueue<T>{
        public DoubleNode<T> head;
        public DoubleNode<T> tail;
    }

    private DoubleNode<T> addValue(DoubleNode head,T value){
        return head;
    }

    private DoubleNode<T> removeValue(DoubleNode head, T value){
        return head;
    }

    private DoubleNode<T> reverseList(DoubleNode head){
        DoubleNode<T> pre = null;
        DoubleNode<T> next = null;
        while(head!=null){
            next = head.next;
            head.next = pre;
            head.last = next;
            pre = head;
            head = next;
        }
        return pre;
    }
}
