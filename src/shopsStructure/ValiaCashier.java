package shopsStructure;

import clients.Clients;

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
}
