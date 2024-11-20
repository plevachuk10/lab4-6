package mobilecompany.services;

import mobilecompany.models.Tariff;

import java.io.*;
import java.util.List;

public class FileHandler {

    // Метод для збереження тарифів у файл
    public static void saveToFile(String fileName, List<Tariff> tariffs) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(tariffs);  // Серіалізуємо список тарифів у файл
        }
    }

    // Метод для зчитування тарифів з файлу
    public static List<Tariff> loadFromFile(String fileName) throws IOException {
        List<Tariff> tariffs = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            tariffs = (List<Tariff>) ois.readObject();  // Десеріалізація
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return tariffs;
    }
}
