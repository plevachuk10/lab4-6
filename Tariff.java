package mobilecompany.models;

import java.io.Serializable;

public class Tariff implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private double subscriptionFee;
    private int numberOfClients;

    public Tariff(String name, double subscriptionFee, int numberOfClients) {
        this.name = name;
        this.subscriptionFee = subscriptionFee;
        this.numberOfClients = numberOfClients;
    }

    // Геттери та сеттери

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSubscriptionFee() {
        return subscriptionFee;
    }

    public void setSubscriptionFee(double subscriptionFee) {
        this.subscriptionFee = subscriptionFee;
    }

    public int getNumberOfClients() {
        return numberOfClients;
    }

    public void setNumberOfClients(int numberOfClients) {
        this.numberOfClients = numberOfClients;
    }

    @Override
    public String toString() {
        return "Tariff{name='" + name + "', subscriptionFee=" + subscriptionFee + ", numberOfClients=" + numberOfClients + '}';
    }
}
