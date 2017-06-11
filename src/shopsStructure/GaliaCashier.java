package shopsStructure;

import clients.Clients;

/**
 * Created by User on 6/10/2017.
 */
public class GaliaCashier extends CashiersThingsToDo implements Cashiers {


    @Override
    public int sellGoods() {
        return scanOnesGoods() + tellThePrice() + giveClientChange();
    }

    @Override
    int scanOnesGoods() {
        return 3;
    }

    @Override
    int tellThePrice() {
        return 4 ;
    }

    @Override
    int giveClientChange() {
        return 5;
    }
}
