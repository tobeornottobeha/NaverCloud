package problem2;

/**
 * @Author default
 * @Description 数组实现队列main函数
 * @Date 14:36 2022/3/19
 **/
public class MyQueueByArrayMain {
    public static void main(String[] args) {
        MyQueueByArray myQueueByArray = new MyQueueByArray();
        // 入队(push方法)
        myQueueByArray.push("1");
        myQueueByArray.push("2");
        myQueueByArray.foreach();
        System.out.println("-----------");
        // 出队(pop方法)
        String pop1 = (String) myQueueByArray.pop();
        myQueueByArray.foreach();

        String pop2 = (String) myQueueByArray.pop();
        // 判断队列是否为空(empty方法)
        if (myQueueByArray.empty()){
            System.out.println("队列为空!");
        }else {
            System.out.println("队列不为空!");
        }

        // 获取队列顶部元素(peek方法)
        System.out.println("队列顶部元素为:" + myQueueByArray.peek());
        myQueueByArray.push("1");
        myQueueByArray.push("2");
        System.out.println("队列顶部元素为:" + myQueueByArray.peek());
    }
}
