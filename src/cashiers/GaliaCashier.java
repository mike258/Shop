package cashiers;

import clients.FastClient;
import strategy.AngryStrategy;
import strategy.CashiersStrategy;
import strategy.FriendlyStrategy;

/**
 * Created by User on 6/10/2017.
 */
public class GaliaCashier extends CashiersThingsToDo implements Cashiers {


    @Override
    int scanOnesGoods() {
        return 3;
    }

    @Override
    int tellThePrice() {
        return 4;
    }

    @Override
    int giveClientChange() {
        return 5;
    }


    @Override
    public int sellGoods() {
        return scanOnesGoods() + tellThePrice() + giveClientChange();
    }

    @Override
    public CashiersStrategy strategy(Class clientClass) {
        if (FastClient.class.isAssignableFrom(clientClass)){
            return new FriendlyStrategy();
        }else{
            return new AngryStrategy();
        }
    }
}

