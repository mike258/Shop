package shopsStructure;

import clients.Clients;
import strategy.CashiersStrategy;

public interface Cashiers {
    int sellGoods();
    CashiersStrategy strategy (Class clientClass);
}
