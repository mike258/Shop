package strategy;

import cashiers.Cashiers;
import clients.Clients;

/**
 * Created by User on 6/14/2017.
 */
public interface CashiersStrategy {
    int communicate(Clients clients, Cashiers cashiers);
}
