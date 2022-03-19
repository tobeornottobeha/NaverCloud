package Problem1;

import java.util.HashMap;

public class CachedData {
    private static HashMap<String,Object> cachedData;

    static {
        cachedData.put("1","1");
        cachedData.put("2","2");
        cachedData.put("3","3");
    }
}
