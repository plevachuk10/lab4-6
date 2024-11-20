package mobilecompany.ui;

import mobilecompany.commands.*;
import mobilecompany.services.TariffManager;

import java.util.Scanner;

public class menu {
    private TariffManager tariffManager;

    public menu() {
        this.tariffManager = new TariffManager();
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===============================");
            System.out.println("📱  WELCOME TO MOBILE COMPANY  📱");
            System.out.println("===============================");
            System.out.println("1. ➕ Add Tariff");
            System.out.println("2. 🔎 Find Tariff by Range");
            System.out.println("3. 📊 Sort Tariffs");
            System.out.println("4. 📋 Display All Tariffs");
            System.out.println("5. 📊 Total Number of Clients");
            System.out.println("6. 💾 Save Tariffs to File");
            System.out.println("7. 📂 Load Tariffs from File");
            System.out.println("8. ❌ Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    new AddTariffCommand(tariffManager).execute();
                    break;
                case 2:
                    new FindTariffCommand(tariffManager).execute();
                    break;
                case 3:
                    new SortTariffsCommand(tariffManager).execute();
                    break;
                case 4:
                    new displayTariffsCommand(tariffManager).execute();
                    break;
                case 5:
                    System.out.println("Total Clients: " + tariffManager.calculateTotalClients());
                    break;
                case 6:
                    new SaveToFileCommand(tariffManager).execute();
                    break;
                case 7:
                    new LoadFromFileCommand(tariffManager).execute();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 8);
    }
}
