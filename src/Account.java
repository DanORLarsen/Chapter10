public class Account {
    int id = 0;
    double balance = 100;

    public Account()
    {
        this.id = id++;
        this.balance = balance;
    }
    public void deposit(int money)
    {this.balance+=money;
        System.out.println(money +"$ has been deposited");
    }
    public void withdraw(int money)
    {this.balance-=money;
        System.out.println(money + "$ has been withdraw");
    }
    public void check()
    {
        System.out.println("The balance is: " + balance + "$");
    }


}
