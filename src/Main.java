public class Main {
    public static void main(String[] args) {

        int initialBalance = 200;
        int addend = 1001;
        int bonus = 0;
        if (addend > 1000) {
            bonus = addend / 100;
        }

        int finalbalance = initialBalance + addend + bonus;
        System.out.println("Итог: " + finalbalance);
        System.out.println("Бонус: " + bonus);

    }
}