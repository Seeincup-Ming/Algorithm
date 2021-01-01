package Node_Things;

public class SingleNode<T> {
    public T value;
    public SingleNode<T> next;

    public SingleNode(T value) {
        this.value = value;
    }

    private SingleNode<T> addValueToHead(SingleNode<T> head, T value) {
        SingleNode<T> sn = new SingleNode<T>(value);
        if(head == null){
            return sn;
        }else{
            sn.next = head;
            head = sn; //将新的节点设置为头部
        }
        return head;
    }

    private SingleNode<T> addValueToTail(SingleNode<T> head, T value) {
        SingleNode<T> sn = new SingleNode<T>(value);
        SingleNode<T> tempNode = head;

        if (head == null) {
            return sn;
        } else { //当前 head 非空，且next后面一直走到空，head 将指向最后一个结点。
            while (head.next != null) {
                head = head.next;
            }//走到最后一个子节点非空的位置
            head.next = sn;
        }
        return tempNode;
    }

    private SingleNode<T> removeValue(SingleNode<T> head, T value) {

        // 找到第一个非 value 的数字，等于，则向后移动，不等则停止。
        while(head!=null){
            if(head.value!=value){
                break;
            }
            head = head.next;
        }

        SingleNode<T> pre = head;
        SingleNode<T> cur = head; // 记录

        while(cur != null){
            if(cur.value == value){
                cur.next = pre.next;
            }else{
                pre = cur;
            }
            cur = cur.next;
        }
        return head;
    }

    private SingleNode<T> reverseList(SingleNode<T> head) {
        if(head==null){
            return null;
        }
        SingleNode<T> pre = null,next = null;

        while(head!=null){
            next = head.next;  // 暂时记录下一个
            head.next = pre; //调整指针
            pre = head;
            head = next; // 向下推进
        }
        return pre;
    }

    private void printSingNodeList1(SingleNode<T> head){
        System.out.print("The test list is:");
        while(head!=null){
            System.out.print(" "+head.value);
            head = head.next;
        }
        System.out.print("The test list is:");
    }

    private void printSingNodeList2(SingleNode<T> head){
        System.out.print("The test list is:");
        for (SingleNode<T> i = head; i!=null; i = i.next) {
            System.out.print(" "+head.value);
        }
        System.out.print("The test list is:");
    }



    public static void main(String[] args) {

    }

//    private SingleNode<Integer> generateRandomLinkedList(int len,int value){
//
//    }


}
