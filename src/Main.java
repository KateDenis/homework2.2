public class Main {
    public static void main(String[] args) {

        int accountBalance = 100;
        int refilling = 1100;
        int bonusStep = 100;
        if (refilling >= 1000) {
            int bonus = refilling / bonusStep;
            System.out.println(accountBalance + refilling + bonus);
        } else {
            int bonus = 0;
            System.out.println(accountBalance + refilling + bonus);
        }

    }
}
