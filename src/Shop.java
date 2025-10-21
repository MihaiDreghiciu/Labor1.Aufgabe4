public class Shop {

    public static int cheapestKeyboard(int[] keyboards) {
        int min = keyboards[0];

        for (int k : keyboards) {
            if (k < min)
                min = k;
        }

        return min;
    }

}
