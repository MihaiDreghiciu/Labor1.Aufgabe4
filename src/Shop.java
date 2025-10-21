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

}
