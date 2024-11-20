package mobilecompany.services;

import mobilecompany.models.Tariff;
import mobilecompany.models.SpecialTariff;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TariffManager {
    private List<Tariff> tariffs;

    public TariffManager() {
        tariffs = new ArrayList<>();
    }

    // Додавання тарифу
    public void addTariff(Tariff tariff) {
        tariffs.add(tariff);
    }

    // Пошук тарифів за діапазоном абонплати
    public List<Tariff> findTariffsByRange(double min, double max) {
        return tariffs.stream()
                .filter(tariff -> tariff.getSubscriptionFee() >= min && tariff.getSubscriptionFee() <= max)
                .collect(Collectors.toList());
    }

    // Підрахунок загальної кількості клієнтів
    public int calculateTotalClients() {
        return tariffs.size();
    }

    // Сортування тарифів за абонплатою
    public void sortTariffsBySubscriptionFee() {
        tariffs.sort((t1, t2) -> Double.compare(t1.getSubscriptionFee(), t2.getSubscriptionFee()));
    }

    // Виведення тарифів
    public List<Tariff> getTariffs() {
        return tariffs;
    }
}
