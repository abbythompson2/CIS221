// Banker class
// Abby Thompson 10 / 31 / 2023



import java.util.Scanner;


public class Banker {
    public static void main(String[] args) {
    	
        BankAccount account = new BankAccount();
        Scanner scanner = new Scanner(System.in);

        String selection;
        int amount;

        System.out.println("Select option: (D)eposit (W)ithdrawal (A)ccount Total (Q)uit: ");
        selection = scanner.next();

        while (!selection.equals("Q")) {

            // Demonstrate deposit
            if (selection.equals("D")) {
                System.out.println("Enter an amount: ");
                try {
                    amount = scanner.nextInt();
                    account.deposit(amount);
                } catch (BankAccountException e) {
                    System.err.println("Error: " + e.getMessage());
                }
            }

            // Demonstrate withdrawal
            if (selection.equals("W")) {
                System.out.println("Enter an amount: ");
                try {
                    amount = scanner.nextInt();
                    account.withdraw(amount);
                } catch (BankAccountException e) {
                    System.err.println("Error: " + e.getMessage());
                }
            }

            // Show account total
            if (selection.equals("A")) {
                System.out.println("Account total: $" + account.getTotal());
            }

            System.out.println("Select option: (D)eposit (W)ithdrawal (A)ccount Total (Q)uit");
            selection = scanner.next();
        }

        scanner.close();
    }
}
