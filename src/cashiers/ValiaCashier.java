package cashiers;

import clients.FastClient;
import strategy.AngryStrategy;
import strategy.CashiersStrategy;
import strategy.FriendlyStrategy;

/**
 * Created by User on 6/10/2017.
 */
public class ValiaCashier extends CashiersThingsToDo implements Cashiers {
    @Override
    public int scanOnesGoods() {
        return 2;
    }

    public int tellThePrice() {
        return 5;
    }

    public int giveClientChange() {
        return 10;
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

