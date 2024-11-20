package mobilecompany.commands;

import mobilecompany.services.TariffManager;

public class SortTariffsCommand implements Command {
    private TariffManager tariffManager;

    public SortTariffsCommand(TariffManager tariffManager) {
        this.tariffManager = tariffManager;
    }

    @Override
    public void execute() {
        tariffManager.sortTariffsBySubscriptionFee();
        System.out.println("Tariffs sorted by subscription fee.");
    }
}
