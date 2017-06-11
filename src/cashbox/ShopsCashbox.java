package cashbox;

/**
 * Created by User on 6/11/2017.
 */
public class ShopsCashbox implements Cashbox {
    @Override
    public int runOutOfPaper() {
        return 15;
    }

    @Override
    public int someTechnicalIssue() {
        return 1000;
    }
}
