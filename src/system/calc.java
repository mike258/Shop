package system;

import clients.TypeOfClients;
import shopsStructure.Cashiers;

/**
 * Created by User on 6/7/2017.
 */
public class calc {
    Questions data = new Questions();

    String name = data.cashiersName();
    int regClints = data.regClients();
    int slowClints = data.slowClients();
    int drunkClients = data.drunkClients();

    TypeOfClients cl = new TypeOfClients();
    Cashiers ca = new Cashiers();

    public void time() {
        int valiasTime = ca.Valia() * (slowClints + regClints + drunkClients) + cl.drunkClient() * drunkClients + cl.slowClient() * slowClints + cl.regularClient() * regClints;
        int galiasTime = ca.Galia() * (slowClints + regClints + drunkClients) + cl.drunkClient() * drunkClients + cl.slowClient() * slowClints + cl.regularClient() * regClints;
        if (name.equals("Valia")) {
            System.out.println(name + " spent " + valiasTime + " seconds in total serving clients today, however Galia could do it for " + galiasTime + " seconds");
        }else {
            System.out.println(name + " spent " + galiasTime + " seconds in total serving clients today, however Valia could do it for " + valiasTime + " seconds");

        }
    }

}
