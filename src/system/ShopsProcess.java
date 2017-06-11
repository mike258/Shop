package system;


import cashbox.ShopsCashbox;
import clients.Clients;
import shopsStructure.Cashiers;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ShopsProcess extends ShopsCashbox implements Runnable {
    private Queue<Clients> line = new LinkedList<>();
    private Cashiers cashiers;


    protected ShopsProcess(Cashiers cashiers) {

        this.cashiers = cashiers;
    }


    public void fillInLine(Clients clients) {
        line.add(clients);
    }


    @Override
    public void run() {
        Random random = new Random();
        int totalTime = 0;
        int numberOfClients = 0;
        int technicalIssue = 0;
        Clients client;

        while ((client = line.poll()) != null) {
            totalTime += cashiers.sellGoods() + client.buyGoods();
            numberOfClients++;
            if (numberOfClients % 10 == 0) {
                totalTime += runOutOfPaper();
            }
            if (random.nextBoolean() == true) {

                totalTime += someTechnicalIssue();
                technicalIssue++;
            }


        }
        System.out.println("required time is " + totalTime + ". number of clients " + numberOfClients);
        if (technicalIssue > 0) {
            if (technicalIssue == 1) {
                System.out.println("Also there was " + technicalIssue + " technical issue");
            } else {
                System.out.println("Also there were " + technicalIssue + " technical issues");
            }
        }

    }
}
