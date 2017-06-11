package clients;

/**
 * Created by User on 6/10/2017.
 */
public class LazyClient extends ClientsThingsToDo implements Clients {
    @Override
    public int putGoods() {
        return 5;
    }

    @Override
    public int payment() {
        return 15;
    }

    @Override
    public int buyGoods() {
        return putGoods() + payment();
    }
}
