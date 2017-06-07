package system;

import java.util.Scanner;

public class Questions {
    Scanner s = new Scanner(System.in);
    public String cashiersName(){
        System.out.println("Who was on duty today? (Galia or Valia)");
        return s.nextLine();
    }
    public int drunkClients(){
        System.out.println("how many drunk clients were today?");
        return s.nextInt();
    }
    public int slowClients(){
        System.out.println("how many slow clients were today?");
        return s.nextInt();
    }
    public int regClients(){
        System.out.println("how many reg clients were today?");
        return s.nextInt();
    }
}
