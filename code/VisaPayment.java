package MockStrategy;

/**
 * Created by Marshall on 12/10/2015.
 */
public class VisaPayment implements Payment {

    CardProvider card;

    @Override
    public void payWithCard(double amount) {
        card = new VisaCard();
        card.pay(amount);
    }
}
