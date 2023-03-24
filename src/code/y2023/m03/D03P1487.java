package code.y2023.m03;

import java.util.*;

public class D03P1487 {
    public String[] getFolderNames(String[] names) {
        List<String> result = new ArrayList<>();
        Map<String, Integer> count = new HashMap<>();
        for (String name : names) {
            if (!count.containsKey(name)) {
                result.add(name);
                count.put(name, 1);
                continue;
            }
            int i = count.get(name);
            while(count.containsKey(name + '(' + i + ')')) {
                i++;
            }
            result.add(name + '(' + i + ')');
            count.put(name + '(' + i + ')', 1);
            count.put(name, i + 1);
        }
        return result.toArray(new String[0]);
    }
}
