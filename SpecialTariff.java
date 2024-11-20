package mobilecompany.models;

public class SpecialTariff extends Tariff {
    private int bonusMinutes;
    private int bonusData;

    // Конструктор SpecialTariff, що передає параметри в конструктор Tariff
    public SpecialTariff(String name, double subscriptionFee, int numberOfClients, int bonusMinutes, int bonusData) {
        super(name, subscriptionFee, numberOfClients);
        this.bonusMinutes = bonusMinutes;
        this.bonusData = bonusData;
    }

    // Геттери та сеттери для bonusMinutes і bonusData

    public int getBonusMinutes() {
        return bonusMinutes;
    }

    public void setBonusMinutes(int bonusMinutes) {
        this.bonusMinutes = bonusMinutes;
    }

    public int getBonusData() {
        return bonusData;
    }

    public void setBonusData(int bonusData) {
        this.bonusData = bonusData;
    }

    @Override
    public String toString() {
        return super.toString() + ", SpecialTariff{bonusMinutes=" + bonusMinutes + ", bonusData=" + bonusData + '}';
    }
}
