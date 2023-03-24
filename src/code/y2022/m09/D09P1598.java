package code.y2022.m09;

public class D09P1598 {
    public int minOperations(String[] logs) {
        int depth = 0;
        for (String log : logs) {
            if ("../".equals(log)) {
                if (depth > 0) {
                    depth -= 1;
                }
            } else if (!"./".equals(log)) {
                depth += 1;
            }
        }
        return depth;
    }
}
