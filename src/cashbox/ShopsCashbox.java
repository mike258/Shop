package cashbox;

/**
 * Created by User on 6/11/2017.
 */
public class ShopsCashbox implements Cashbox {
    @Override
    public int runOutOfPaper() {
        return 5;
    }

    @Override
    public int someTechnicalIssue() {
        return 10;
    }
}
