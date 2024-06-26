package com.ilyass.axoncqrseventsourcing.commonapi.events;

import com.ilyass.axoncqrseventsourcing.commonapi.enums.AccountStatus;
import lombok.Getter;

public class AccountHeldEvent extends BaseEvent<String> {
    @Getter private final AccountStatus status;

    public AccountHeldEvent(String id, AccountStatus status) {
        super(id);
        this.status = status;
    }
}
