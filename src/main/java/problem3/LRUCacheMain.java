package problem3;

public class LRUCacheMain {
    public static void main(String[] args) {
        MyLRUCache myLRUCache = new MyLRUCache(10);

        myLRUCache.set(1,2);
        System.out.println(myLRUCache.get(1));
    }
}
