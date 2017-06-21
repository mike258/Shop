package system;


import cashbox.ShopsCashbox;
import clients.Clients;
import cashiers.Cashiers;
import clients.FillInQueue;
import exception.runOutOfPaperException;
import exception.techicalException;
import strategy.CashiersStrategy;
import exception.exeptionChecker;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ShopsProcess extends ShopsCashbox implements Runnable {
    private Queue<Clients> line = new LinkedList<>();
    private Cashiers cashiers;

    public ShopsProcess(Cashiers cashiers) {

        this.cashiers = cashiers;
    }
    public ShopsProcess(){

    }

    exeptionChecker exeptionChecker = new exeptionChecker();

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
        FillInQueue fillInQueue = new FillInQueue();
        fillInQueue.queue();
       // try {
            while ((client = line.poll()) != null) {
                CashiersStrategy strategy = cashiers.strategy(client.getClass());
                totalTime += strategy.communicate(client, cashiers);
                numberOfClients++;


                if (numberOfClients % 10 == 0) {
                    totalTime += runOutOfPaper();
                   // exeptionChecker.runOutOfPaper();

                }
                if (random.nextBoolean() == true) {

                    totalTime += someTechnicalIssue();
                    technicalIssue++;
                 //   exeptionChecker.technical();
                }

            }
        /*} catch (runOutOfPaperException e) {
            System.err.println(e.getMessage());

        } catch (techicalException e) {
            System.out.println(e.getMessage());
        }*/
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
