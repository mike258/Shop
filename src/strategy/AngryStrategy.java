package strategy;

import cashiers.Cashiers;
import clients.Clients;
import clients.FastClient;

/**
 * Created by User on 6/14/2017.
 */
public class AngryStrategy implements CashiersStrategy {
    private  int angryCoefficient = 5;
    @Override
    public int communicate(Clients clients, Cashiers cashiers) {

        return clients.buyGoods() + angryCoefficient + cashiers.sellGoods();
    }
}
