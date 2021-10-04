public class Main {
    public static void main(String[] args) {

        double accountBalance = 100;
        double refilling = 700;
        int bonusStep = 100;
        if (refilling >= 1000) {
            int bonus = (int) refilling / bonusStep;
            System.out.println(accountBalance + refilling + bonus);
        } else {
            int bonus = 0;
            System.out.println(accountBalance + refilling + bonus);
        }

    }
}
