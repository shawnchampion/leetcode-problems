package code.history;

import java.util.HashMap;
import java.util.Map;

public class P677 {

    final private Map<String, Integer> map;

    public P677() {
        map = new HashMap<>();
    }

    public void insert(String key, int val) {
        map.put(key, val);
    }

    public int sum(String prefix) {
        int total = 0;
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            if (entry.getKey().startsWith(prefix)) {
                total += entry.getValue();
            }
        }
        return total;
    }
}
