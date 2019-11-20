import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Locale_Java8 {

    public static void main(String[] args) {
        Locale currentLocal = Locale.getDefault();
        Currency currency = Currency.getInstance(currentLocal);
        NumberFormat nf = NumberFormat.getCurrencyInstance(currentLocal);
        System.out.println(currentLocal.getDisplayName());
        System.out.println(currency.getDisplayName());
        System.out.println(nf.format(5000));
    }
}
