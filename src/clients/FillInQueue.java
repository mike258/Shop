package clients;

import cashiers.GaliaCashier;
import com.sun.org.glassfish.external.statistics.RangeStatistic;
import system.ShopsProcess;

import java.util.Random;

/**
 * Created by User on 6/21/2017.
 */
public class FillInQueue {
    public void queue(){

        ShopsProcess shopsProcess = new ShopsProcess(new GaliaCashier());
        Random rand = new Random();
        int fast = 0;
        int lazy = 0;
        for (int i = 0; i < 25; i++) {
            if (rand.nextBoolean()) {
                shopsProcess.fillInLine(new LazyClient());
                lazy++;
            } else {
                shopsProcess.fillInLine(new FastClient());
                fast++;
            }
        }
        System.out.println(fast + " - fast " + lazy + " - lazy");
    }
 }
