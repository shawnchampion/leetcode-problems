package code.y2023.m03;

public class D13P2383 {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        // 处理精力，精力要大于所有敌人之和
        int sum = 0;
        for (int i : energy) {
            sum += i;
        }
        int x = Math.max(sum + 1 - initialEnergy, 0);
        // 处理经验
        int y = 0;
        int exp = initialExperience;
        for (int i : experience) {
            if (exp <= i) {
                y += i + 1 - exp;
                exp = i + 1;
            }
            exp += i;
        }
        return x + y;
    }
}
