import java.util.ArrayList;
import java.util.Scanner;
public class Password_Manager {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> accounts = new ArrayList<>();
            ArrayList<String> passwords = new ArrayList<>();

            while (true) {
                System.out.println("\n=== Password Manager ===");
                System.out.println("1. Add Password");
                System.out.println("2. View Passwords");
                System.out.println("3. Exit");

                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                    System.out.print("Enter account name: ");
                    String account = scanner.nextLine();

                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();

                    accounts.add(account);
                    passwords.add(password);

                    System.out.println("Password saved.");
                }
                else if (choice == 2) {
                    System.out.println("\nSaved Passwords:");
                    for (int i = 0; i < accounts.size(); i++) {
                        System.out.println(accounts.get(i) + " -> " + passwords.get(i));
                    }
                }
                else if (choice == 3) {
                    System.out.println("Exiting program.");
                    break;
                }
                else {
                    System.out.println("Invalid choice.");
                }
            }
        }
    }

