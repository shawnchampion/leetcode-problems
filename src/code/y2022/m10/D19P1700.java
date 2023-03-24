package code.y2022.m10;

import java.util.ArrayDeque;
import java.util.Queue;

public class D19P1700 {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new ArrayDeque<>();
        for (int student : students) {
            queue.offer(student);
        }
        for (int sandwich : sandwiches) {
            int count = 0;
            boolean flag = false;
            while(count++ < queue.size()) {
                int student = queue.poll();
                if (student == sandwich) {
                    flag = true;
                    break;
                }
                queue.offer(student);
            }
            if (!flag) {
                break;
            }
        }
        return queue.size();
    }
}
