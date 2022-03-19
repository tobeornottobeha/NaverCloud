package problem2;

import sun.misc.LRUCache;

/**
 * @Author default
 * @Description 数组实现队列main函数
 * @Date 14:36 2022/3/19
 **/
public class MyQueueByStackMain {
    public static void main(String[] args) {
        MyQueueByStack stackQueue = new MyQueueByStack();
        stackQueue.push(1);
        stackQueue.push(2);
        stackQueue.push(3);

        System.out.println(stackQueue.pop());
        System.out.println(stackQueue.pop());
        System.out.println(stackQueue.pop());

        stackQueue.push(4);
        System.out.println(stackQueue.pop());

        if (Boolean.TRUE.equals(stackQueue.empty()))
            System.out.println("队列为空!");

        stackQueue.push(5);
        if (Boolean.FALSE.equals(stackQueue.empty()))
            System.out.println("队列不为空!");


    }
}
