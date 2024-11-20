package mobilecompany.commands;

import mobilecompany.models.Tariff;
import mobilecompany.services.FileHandler;
import mobilecompany.services.TariffManager;

import java.io.IOException;

import java.util.List;

// Команда для завантаження тарифів із файлу
public class LoadFromFileCommand {
    private TariffManager tariffManager;

    public LoadFromFileCommand(TariffManager tariffManager) {
        this.tariffManager = tariffManager;
    }

    public void execute() {
        try {
            // Завантажуємо тарифи з файлу
            List<Tariff> tariffs = FileHandler.loadFromFile("tariffs.dat");
            for (Tariff tariff : tariffs) {
                tariffManager.addTariff(tariff);
            }
            System.out.println("Тарифи успішно завантажені.");
        } catch (IOException e) {
            // Обробка виключення при роботі з файлами
            System.out.println("Помилка завантаження файлу: " + e.getMessage());
        }
    }
}
