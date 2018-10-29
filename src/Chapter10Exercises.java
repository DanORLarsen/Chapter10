import java.util.Scanner;

public class Chapter10Exercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pick which exercise u want executed: ");
        int choice = sc.nextInt();

        //10.1 Make Time class with pre determined names and functions.
        if (choice == 1)
        {
            Time first = new Time();
            System.out.println("first");
            first.displayTime();
            System.out.println("\nsecond");
            Time second = new Time(555550000);
            second.displayTime();
        }

        if (choice == 7)
        {//You can go in debt on these accounts :)
            System.out.println("All accounts start with 100$ and you can pick from 0 to 9");
            ATM atm = new ATM();
            atm.useATM();
        }
        if (choice == 26) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter calculation");
            String userInput = scan.nextLine();

            //Trimming all spaces away, and splitting
            String a = userInput.replaceAll(" ", "");
            a = a.replaceAll("[+]", "#+#");
            a = a.replaceAll("[-]", "#-#");
            a = a.replaceAll("[/]", "#/#");
            a = a.replaceAll("[*]", "#*#");
            args = a.split("#");

            if (args.length != 3) {
                System.out.println("You cant have multiple calculations");
            }

            int total = 0;
            switch (args[1].charAt(0)) {
                case '+' : total = Integer.parseInt(args[0]) +
                        Integer.parseInt(args[2]);
                    break;
                case '-' : total = Integer.parseInt(args[0]) -
                        Integer.parseInt(args[2]);
                    break;
                case '*' : total = Integer.parseInt(args[0]) *
                        Integer.parseInt(args[2]);
                    break;
                case '/' : total = Integer.parseInt(args[0]) /
                        Integer.parseInt(args[2]);
                    break;

            }
            System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + total);
        }

        if (choice == 28)
        {char[] chars = {'I', 'n', 's', 'e', 'r', 't'};

            // Create two objects
            MyStringBuilder2 str1 = new MyStringBuilder2("testString");
            MyStringBuilder2 str2 = new MyStringBuilder2(chars);

            // Insert s2 into s1 at index 3
            System.out.print("\nInsert string 2 into string 1 at index 3: ");
            MyStringBuilder2 str3 = str1.insert(3, str2);
            System.out.println(str3);

            // Reverse str1
            System.out.println("\nReverse string 1: " + str1.reverse());

            // Create a substring of str3 from index 10
            System.out.println("\nSubstring of string 3 beginning index 10: " +
                    str3.substring(10));

            // Display str2 in all upper case
            System.out.println("\nString 2 to upper case: " + str2.toUpperCase());}


        else
            System.out.println("☠☣ Invalid input ☣☠");

    }
}
