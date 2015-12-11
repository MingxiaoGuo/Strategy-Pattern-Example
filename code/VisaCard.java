package MockStrategy;

/**
 * Created by Marshall on 12/10/2015.
 */
public class VisaCard implements CardProvider {
    @Override
    public void pay(double amount) {
        System.out.printf("Pay %.2f with Visa card\n", amount);
    }
}
