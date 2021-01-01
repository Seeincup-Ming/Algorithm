package Node_Things;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TwoStackImplementQueue {

    public static class TwoStackQueue{

        public Stack<Integer> stackPush;//入栈
        public Stack<Integer> stackPop; //出栈
        public Queue<Integer> queue;


        public TwoStackQueue() {
            stackPush = new Stack<>();
            stackPop  = new Stack<>();
            queue = new LinkedList<>();
        }//初始化构造函数

        private void pushToPop(){
            if(stackPop.empty()){//这个判断很必要，当 pop 栈为空的时候，才可以做循环迁移
                while(!stackPush.empty()){
                    stackPop.push(stackPush.pop());
                }
            }
        }
        private void add(Integer value){
            stackPush.push(value);
            pushToPop();
        }

        private Integer poll(){
            if(stackPop.empty()&&stackPush.empty()){
                throw new RuntimeException("Queue is empty");
            }
            pushToPop();
            return stackPop.pop();
        }
        private Integer peek(){
            if(stackPop.empty()&&stackPush.empty()){
                throw new RuntimeException("Queue is empty");
            }
            pushToPop();
            return stackPop.peek();
        }
    }
}
