package mobilecompany.commands;

import mobilecompany.services.TariffManager;

public class CalculateTotalCustomersCommand implements Command {

    private TariffManager tariffManager;

    // Конструктор для ініціалізації TariffManager
    public CalculateTotalCustomersCommand(TariffManager tariffManager) {
        this.tariffManager = tariffManager;
    }

    // Метод виконання команди
    @Override
    public void execute() {
        // Викликаємо метод для обчислення загальної кількості клієнтів
        int totalClients = tariffManager.calculateTotalClients();
        // Виводимо кількість клієнтів
        System.out.println("Загальна кількість клієнтів: " + totalClients);
    }
}
