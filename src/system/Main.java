package system;

import clients.FastClient;
import clients.LazyClient;
import cashiers.GaliaCashier;

import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String args[]) {
        Random rand = new Random();

        ShopsProcess shopsProcess = new ShopsProcess();



        ExecutorService loop = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {

            loop.submit(shopsProcess);
        }
        loop.shutdown();
    }


}
