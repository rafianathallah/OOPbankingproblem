import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int choice;

        System.out.println("Bank name: ");
        String bankname = obj.next();
        Bank bank = new Bank(bankname);

        do {
            System.out.println("1. Add customers\n2. View customer by ID\n3. View total number of customers\n4. Deposit\n5. Withdraw\n6. Exit");
            System.out.print("Your choice: ");

            choice = obj.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter your first name: ");
                    String firstname = obj.next();
                    System.out.print("Enter your last name: ");
                    String lastname = obj.next();
                    System.out.print("Enter your initial balance: ");
                    double initial = obj.nextDouble();
                    bank.addCustomer(firstname, lastname, initial);
                    break;

                case 2:
                    System.out.print("Enter your ID: ");
                    int index = obj.nextInt();
                    Customer customer = bank.getCustomer(index);
                    System.out.println("Name: " + customer.getFirstname() + customer.getLastname());
                    System.out.println("Balance: " + customer.getAccount().getBalance());
                    break;

                case 3:
                    System.out.println("Number of customers: " + bank.getNumberOfCustomers());
                    break;

                case 4:
                    System.out.print("Enter your ID: ");
                    int id = obj.nextInt();
                    System.out.print("Enter amount to deposit: ");
                    double d = obj.nextDouble();
                    Customer currentcustomer = bank.getCustomer(id);
                    currentcustomer.getAccount().deposit(d);
                    double balance = currentcustomer.getAccount().getBalance();
                    System.out.println("Current balance: " + balance);
                    break;

                case 5:
                    System.out.print("Enter your ID: ");
                    int id2 = obj.nextInt();
                    System.out.print("Enter amount to withdraw: ");
                    double w = obj.nextDouble();
                    Customer currentcustomer2 = bank.getCustomer(id2);
                    currentcustomer2.getAccount().withdraw(w);
                    double balance2 = currentcustomer2.getAccount().getBalance();
                    System.out.println("Current balance: " + balance2);
                    break;
            }
        } while (choice != 6);
        System.out.println("See you next time!");
    }
}