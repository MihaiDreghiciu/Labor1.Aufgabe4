public class Main {

    static void main() {
        int[] keyboards = {40, 35, 70, 15, 45};
        System.out.println(Shop.cheapestKeyboard(keyboards));
        int[] tastatur = {15, 20, 10, 35}, usb = {20, 15, 40, 15};
        System.out.println(Shop.mostExpensiveItem(tastatur, usb));
        int[] preise = {15, 45, 20};
        System.out.println(Shop.mostExpensiveUsbWithinBudget(preise, 30));
        int[] tastaturen = {40, 50, 60}, usbs = {8, 12};
        System.out.println(Shop.maxMoneySpent(tastaturen, usbs, 60));
    }

}
