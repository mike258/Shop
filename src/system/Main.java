package system;

import cashbox.ShopsCashbox;
import clients.FastClient;
import clients.LazyClient;
import shopsStructure.GaliaCashier;

import java.util.Random;

public class Main {
    public static void main(String args[]) {
        Random rand = new Random();
        ShopsProcess shopsProcess = new ShopsProcess(new GaliaCashier());



        int fast = 0;
        int lazy = 0;
        for (int i = 0; i < rand.nextInt(100) + 1; i++) {
            if (rand.nextBoolean()) {
                shopsProcess.fillInLine(new LazyClient());
                lazy++;
            } else {
                shopsProcess.fillInLine(new FastClient());
                fast++;
            }

        }

        System.out.println(fast + " - fast " + lazy + " - lazy");
        shopsProcess.run();

    }


}
