package View;

import Controler.ControlerLivada;
import Entities.Cires;
import Entities.Livada;
import Entities.Mar;
import Entities.Par;

import java.util.Scanner;

public class View {
    private final ControlerLivada controler;
    private final Scanner scanner = new Scanner(System.in);

    public View(ControlerLivada controler) {
        this.controler = controler;
    }

    public void start() {
        while (true) {
            printMenu();
            System.out.print("Choose option: ");
            int choice = -1;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number, try again!");
                continue;
            }

            switch (choice) {
                case 1 -> addTree();
                case 2 -> removeTree();
                case 3 -> controler.display();
                case 4 -> controler.displayWithCondition();
                case 0 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid option, try again!");
            }
        }
    }

    private void printMenu() {
        System.out.println("\n====== LIVADA MENU ======");
        System.out.println("1. Add tree");
        System.out.println("2. Remove tree");
        System.out.println("3. Display all trees");
        System.out.println("4. Display trees older than 3 years");
        System.out.println("0. Exit");
        System.out.println("=========================");
    }

    private void addTree() {
        System.out.print("Enter tree type (mar/par/cires): ");
        String type = scanner.nextLine().trim().toLowerCase();
        System.out.print("Enter tree age: ");
        int age;
        try {
            age = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid age!");
            return;
        }

        Livada tree = switch (type) {
            case "mar" -> new Mar(age);
            case "par" -> new Par(age);
            case "cires" -> new Cires(age);
            default -> {
                System.out.println("Unknown tree type!");
                yield null;
            }
        };

        if (tree != null) {
            controler.add(tree);
            System.out.println("Tree added successfully!");
        }
    }

    private void removeTree() {
        System.out.print("Enter tree index to remove: ");
        try {
            int index = Integer.parseInt(scanner.nextLine());
            controler.remove(index);
            System.out.println("Tree removed!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
