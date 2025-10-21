public class Shop {

    public static int cheapestKeyboard(int[] keyboards) {
        int min = keyboards[0];

        for (int k : keyboards) {
            if (k < min)
                min = k;
        }

        return min;
    }

    public static int mostExpensiveItem(int[] keyboards, int[] usbs) {
        int max = keyboards[0];

        for (int k : keyboards)
            if (k > max)
                max = k;

        for (int u : usbs)
            if (u > max)
                max = u;

        return max;
    }

    public static int mostExpensiveUsbWithinBudget(int[] usbs, int budget) {
        int best = -1;

        for (int u : usbs) {
            if (u <= budget && u > best)
                best = u;
        }

        return best;
    }

    public static int maxMoneySpent(int[] keyboards, int[] usbs, int budget) {
        int max = -1;

        for (int k : keyboards) {
            for (int u : usbs) {
                int total = k + u;
                if (total <= budget && total > max) {
                    max = total;
                }
            }
        }

        return max;
    }

}
