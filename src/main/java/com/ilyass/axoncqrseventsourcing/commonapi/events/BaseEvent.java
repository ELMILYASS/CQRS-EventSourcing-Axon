package com.ilyass.axoncqrseventsourcing.commonapi.events;

import lombok.Getter;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class BaseEvent<T> {
    @Getter private T id;
    public BaseEvent(T id) {
        this.id = id;
    }
}
