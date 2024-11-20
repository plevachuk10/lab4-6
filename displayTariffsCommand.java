package mobilecompany.commands;

import mobilecompany.services.TariffManager;

public class displayTariffsCommand implements Command {
    private TariffManager tariffManager;

    public displayTariffsCommand(TariffManager tariffManager) {
        this.tariffManager = tariffManager;
    }

    @Override
    public void execute() {
        tariffManager.getTariffs().forEach(System.out::println);
    }
}
