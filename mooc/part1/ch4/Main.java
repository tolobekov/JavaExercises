package mooc.part1.ch4;

public class Main {
    public static void main(String[] args) {
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);
        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        print(paulsCard, mattsCard);
        paulsCard.addMoney(20);
        mattsCard.eatHeartily();
        print(paulsCard, mattsCard);
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);
        print(paulsCard, mattsCard);

    }

    public static void print(PaymentCard paulsCard, PaymentCard mattsCard) {
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
    }
}
