package problem2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author default
 */
public class MyQueueByStack {
    /**
     * 定义两个栈来实现队列
     * 栈A 负责插入新元素
     * 栈B 负责移除老元素
     */
    private Stack<Object> stackPush = new Stack<>();
    private Stack<Object> stackPop = new Stack<>();

    /**
     * 入队
     * @Param o
     */
    public void push(Object o){
        stackPush.push(o);
    }

    /**
     *
     * 出队操作
     */
    public Object pop(){
        if (stackPop.isEmpty()){
            if (stackPush.isEmpty()){
                return null;
            }
            fetchFormstackPush();
        }
        return stackPop.pop();
    }

    /**
     * 从stackPush栈中拿到出栈元素压入栈B
     */
    private void fetchFormstackPush() {
        while (!stackPush.isEmpty()){
            stackPop.push(stackPush.pop());
        }
    }

    /**
     * 判断队列是否为空
     */
    public boolean empty(){
        return stackPush.isEmpty() && stackPop.isEmpty();
    }
}
