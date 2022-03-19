package problem2;

import java.util.ArrayList;
import java.util.List;

public class MyQueueByArray {
    /**
     * 定义一个数组
     */
    List<Object> myQueueList = new ArrayList<>();

    MyQueueByArray() {
    }

    /**
     * 入队
     * @param o
     */
    public void push(Object o) {
        myQueueList.add(o);
    }

    /**
     * 出队
     */
    public Object pop() {
        if (myQueueList != null && myQueueList.size() > 0) {
            Object o = myQueueList.get(0);
            myQueueList.remove(0);
            return o;
        }
        return null;
    }

    /**
     * 判断队列是否为空
     * @return
     */
    public boolean empty() {
        return myQueueList.isEmpty();
    }

    /**
     * 返回队头
     * @return
     */
    public Object peek() {
        if (myQueueList.isEmpty()){
            return null;
        }
        return myQueueList.get(0);
    }

    /**
     * 遍历
     */
    public void foreach() {
        System.out.print("队列为:");
        for (Object o : myQueueList) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
