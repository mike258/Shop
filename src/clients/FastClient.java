package clients;

/**
 * Created by User on 6/10/2017.
 */
public class FastClient extends  ClientsThingsToDo implements Clients {
    @Override
    public int putGoods() {
        return 3;
    }

    @Override
    public int payment() {
        return 12;
    }

    @Override
    public int buyGoods() {
        return payment() + putGoods();
    }
}
