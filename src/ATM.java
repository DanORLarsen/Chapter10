import java.util.Scanner;

public class ATM {
public ATM()
{}
    public void useATM() {
        Account a = new Account(); //id 0
        Account b = new Account(); //id 1
        Account c = new Account(); //Also matches with index
        Account d = new Account(); //and so on..
        Account e = new Account();
        Account f = new Account();
        Account g = new Account();
        Account h = new Account();
        Account i = new Account();
        Account j = new Account(); //id 9
        Account[] accounts = {a, b, c, d, e, f, g, h, i, j};

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Pick id: ");
            int idPick = sc.nextInt();
            if (idPick > 10) {
                break;
            }
            while (idPick < 10) {
                System.out.println("\nMain Menu");
                System.out.println("1: Check balance");
                System.out.println("2: Withdraw");
                System.out.println("3: Deposit");
                System.out.println("4: Exit");
                System.out.print("Enter a choice: ");
                int choice = sc.nextInt();
                if (choice == 1) {
                    accounts[idPick].check();
                    System.out.println();
                    continue;
                }
                if (choice == 2) {
                    System.out.print("Enter withdraw amount: ");
                    int money = sc.nextInt();
                    accounts[idPick].withdraw(money);
                    System.out.println();
                    continue;
                }

                if (choice == 3) {
                    System.out.print("Enter deposit amount: ");
                    int money = sc.nextInt();
                    accounts[idPick].deposit(money);
                    System.out.println();
                    continue;
                }

                if (choice == 4) ;
                {
                    System.out.println();
                    break;
                }


            }
        } while (true);
    }


}

