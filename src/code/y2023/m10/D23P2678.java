package code.y2023.m10;

public class D23P2678 {
    public int countSeniors(String[] details) {
        int count = 0;
        for (String detail: details) {
            int age = Integer.parseInt(detail.substring(11, 13));
            if (age > 60) {
                count++;
            }
        }
        return count;
    }
}
