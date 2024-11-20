package mobilecompany.commands;

import mobilecompany.models.Tariff;
import mobilecompany.models.SpecialTariff;
import mobilecompany.services.TariffManager;
import java.util.Scanner;

public class AddTariffCommand {
    private TariffManager tariffManager;

    public AddTariffCommand(TariffManager tariffManager) {
        this.tariffManager = tariffManager;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        // Запит даних для тарифу
        System.out.print("Enter tariff name: ");
        String name = scanner.nextLine();

        System.out.print("Enter subscription fee: ");
        double subscriptionFee = scanner.nextDouble();

        System.out.print("Enter number of clients: ");
        int numberOfClients = scanner.nextInt();

        // Додавання тарифу
        Tariff tariff = new Tariff(name, subscriptionFee, numberOfClients);
        tariffManager.addTariff(tariff);

        System.out.println("Tariff added successfully!");

        // Додавання спеціального тарифу (якщо потрібно)
        System.out.print("Enter bonus minutes: ");
        int bonusMinutes = scanner.nextInt();

        System.out.print("Enter bonus data: ");
        int bonusData = scanner.nextInt();

        SpecialTariff specialTariff = new SpecialTariff(name, subscriptionFee, numberOfClients, bonusMinutes, bonusData);
        tariffManager.addTariff(specialTariff);

        System.out.println("Special tariff added successfully!");
    }
}
