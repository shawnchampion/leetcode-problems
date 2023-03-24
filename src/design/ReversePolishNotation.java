package design;

import java.util.*;

public class ReversePolishNotation {
    private static final Map<Character, Integer> priority = new HashMap<Character, Integer>() {{
        put('(', 0);
        put('+', 1);
        put('-', 1);
        put('*', 2);
        put('/', 2);
    }};

    public static void main(String[] args) {
        System.out.println(suffix("56+57*58+(59*60+61)*62"));
    }

    private static List<String> suffix(String infixNotation) {
        List<String> params = new ArrayList<>();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < infixNotation.length(); i++) {
            char c = infixNotation.charAt(i);
            if (c >= '0' && c <= '9') {
                int num = c - '0';
                // 若下一位仍为数字
                while (i + 1 < infixNotation.length()) {
                    c = infixNotation.charAt(i + 1);
                    if (c >= '0' && c <= '9') {
                        num = num * 10 + c - '0';
                        i++;
                    } else {
                        break;
                    }
                }
                params.add(String.valueOf(num));
            } else if (stack.isEmpty()) {
                stack.push(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (stack.peek() != '(') {
                    params.add(String.valueOf(stack.pop()));
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && priority.get(stack.peek()) >= priority.get(c)) {
                    params.add(String.valueOf(stack.pop()));
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            params.add(String.valueOf(stack.pop()));
        }
        return params;
    }
}
