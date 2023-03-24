package code.history;

import java.util.HashMap;
import java.util.Map;

public class P299 {
    public static void main(String[] args) {
        System.out.println(getHint("1", "1"));
    }

    public static String getHint(String secret, String guess) {
        HashMap<Character, Integer> secretMap = new HashMap<>();
        HashMap<Character, Integer> guessMap = new HashMap<>();
        int a = 0, b = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                a++;
                continue;
            }
            secretMap.put(secret.charAt(i), secretMap.getOrDefault(secret.charAt(i), 0) + 1);
            guessMap.put(guess.charAt(i), guessMap.getOrDefault(guess.charAt(i), 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry: guessMap.entrySet()) {
            b += Math.min(entry.getValue(), secretMap.getOrDefault(entry.getKey(), 0));
        }
        return new StringBuilder().append(a).append("A").append(b).append("B").toString();
    }
}
