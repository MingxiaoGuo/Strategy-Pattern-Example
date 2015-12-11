package MockStrategy;

/**
 * Created by Marshall on 12/10/2015.
 */
public class MainTest {

    public static void main(String[] args) {

        double amount = 3.50;

        new VisaPayment().payWithCard(amount);
        new MasterPayment().payWithCard(amount);

    }

}
