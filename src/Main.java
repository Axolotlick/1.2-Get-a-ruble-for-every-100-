public class Main {
    public static void main(String[] args) {
        int currentAmount = 900;
        int topUpAmount = 300;
        int totalAmount = currentAmount + topUpAmount;
        int bonus;

        if (totalAmount > 1_000) {
            bonus = topUpAmount / 100;
        } else {
            bonus = 0;
        }
        if (topUpAmount >= 100) {
            bonus = topUpAmount / 100;
        } else {
            bonus = 0;
        }

        int total = currentAmount + topUpAmount + bonus;

        System.out.println(total);
    }
}