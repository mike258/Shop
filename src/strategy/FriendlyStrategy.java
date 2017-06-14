package strategy;

import clients.Clients;

/**
 * Created by User on 6/14/2017.
 */
public class FriendlyStrategy implements CashiersStrategy {
    private int friendlyCoefficient = 5;
    @Override
    public int communicate(Clients clients) {
        return clients.buyGoods() - friendlyCoefficient;
    }
}
