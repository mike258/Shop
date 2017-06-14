package cashiers;

import strategy.CashiersStrategy;

public interface Cashiers {
    int sellGoods();
    CashiersStrategy strategy (Class clientClass);
}
