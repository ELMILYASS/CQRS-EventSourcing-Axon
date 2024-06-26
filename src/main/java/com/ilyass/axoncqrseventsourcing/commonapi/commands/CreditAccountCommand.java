package com.ilyass.axoncqrseventsourcing.commonapi.commands;

import lombok.Getter;

import java.math.BigDecimal;

public class CreditAccountCommand extends BaseCommand<String> {
    @Getter private double amount;
    @Getter private String currency;
    public CreditAccountCommand(String id, double amount, String currency) {
        super(id);
        this.amount = amount;
        this.currency = currency;
    }
}
