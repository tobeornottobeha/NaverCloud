package problem3;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author default
 * @Description Design a data structure for Least Recently Used cache, which supports get&put operations.
 * @Date 15:06 2022/3/19
 * @Param 
 * @return 
 **/
public class MyLRUCache {
    private int capacity, size;
    private ListNode dummy, tail;
    private Map<Integer, ListNode> keyToPrev;

    public MyLRUCache(int capacity) {
        this.capacity = capacity;
        this.keyToPrev = new HashMap<Integer, ListNode>();
        this.dummy = new ListNode(0, 0);
        this.tail = this.dummy;
    }

    public int get(int key) {
        if (!keyToPrev.containsKey(key)) {
            return 0;
        }
        moveToTail(key);
        return tail.val;
    }

    private void moveToTail(int key) {
        ListNode prev = keyToPrev.get(key);
        ListNode curt = prev.next;
        if (tail == curt) {
            return;
        }

        prev.next = prev.next.next;
        tail.next = curt;

        if (prev.next != null) {
            keyToPrev.put(prev.next.key, prev);
        }
        keyToPrev.put(curt.key, tail);

        tail = curt;
    }

    public void set(int key, int value) {
        if (get(key) != -1) {
            ListNode prev = keyToPrev.get(key);
            prev.next.val = value;
            return;
        }

        if (size < capacity) {

        }

    }

}
