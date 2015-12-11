package MockStrategy;

/**
 * Created by Marshall on 12/10/2015.
 */
public class MasterPayment implements Payment {

    CardProvider card;

    @Override
    public void payWithCard(double amount) {
        card = new MasterCard();
        card.pay(amount);
    }
}
