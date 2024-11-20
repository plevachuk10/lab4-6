package mobilecompany.commands;

import mobilecompany.services.TariffManager;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveToFileCommand implements Command {
    private TariffManager tariffManager;

    public SaveToFileCommand(TariffManager tariffManager) {
        this.tariffManager = tariffManager;
    }

    @Override
    public void execute() {
        // Вкажіть шлях до файлу на робочому столі
        String filePath = "C:\\Users\\monos.com.ua\\Desktop\\tariffs.dat.txt"; // Замість <Ваше_Ім'я_Користувача> вкажіть своє ім'я користувача
        File file = new File(filePath);

        // Перевірка, чи існує файл
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("Файл не існував, він був створений на робочому столі.");
            } catch (IOException e) {
                System.out.println("Помилка створення файлу: " + e.getMessage());
                return;
            }
        }

        // Збереження тарифів у файл
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(tariffManager.getTariffs());
            System.out.println("Тарифи успішно збережено у файл на робочому столі.");
        } catch (IOException e) {
            System.out.println("Помилка збереження у файл: " + e.getMessage());
        }
    }
}
