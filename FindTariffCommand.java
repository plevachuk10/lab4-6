package mobilecompany.commands;

import mobilecompany.services.TariffManager;
import mobilecompany.models.Tariff;
import java.util.List;
import java.util.Scanner;

public class FindTariffCommand implements Command {
    private TariffManager tariffManager;

    public FindTariffCommand(TariffManager tariffManager) {
        this.tariffManager = tariffManager;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter minimum subscription fee: ");
        double min = scanner.nextDouble();

        System.out.print("Enter maximum subscription fee: ");
        double max = scanner.nextDouble();

        List<Tariff> foundTariffs = tariffManager.findTariffsByRange(min, max);
        if (foundTariffs.isEmpty()) {
            System.out.println("No tariffs found in the given range.");
        } else {
            foundTariffs.forEach(System.out::println);
        }
    }
}
