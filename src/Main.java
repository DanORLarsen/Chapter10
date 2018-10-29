import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pick which exercise u want executed: ");
        int Choise = sc.nextInt();

        //10.1 Make Time class with pre determined names and functions.
        if (Choise == 1)
        {
            Time first = new Time();
            System.out.println("first");
            first.displayTime();
            System.out.println();
            System.out.println("second");
            Time second = new Time(555550000);
            second.displayTime();
        }
    }
}
