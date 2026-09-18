package week4;

public class Payment {

    void pay(double amount) {
        System.out.println("Paid (cash): Rs " + amount);
    }

    public static void main(String[] args) {

        Payment[] payments = {
            new CardPayment(),
            new Payment(),
            new CardPayment(),
            new Payment(),
            new CardPayment()
        };

        double[] amounts = {100, 50, 200, 75, 120};

        double totalCollected = 0;

        for (int i = 0; i < payments.length; i++) {

            if (payments[i] instanceof CardPayment) {
                CardPayment card = (CardPayment) payments[i];
                card.payWithProcessingFee(amounts[i]);

                totalCollected += amounts[i] * 1.02;
            } else {
                payments[i].pay(amounts[i]);

                totalCollected += amounts[i];
            }
        }

        System.out.println("Total Collected: Rs " + totalCollected);
    }
}

class CardPayment extends Payment {

    void payWithProcessingFee(double amount) {
        double total = amount * 1.02;
        System.out.println("Charged (card, incl. fee): Rs " + total);
    }
}