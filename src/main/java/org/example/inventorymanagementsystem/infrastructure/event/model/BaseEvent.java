package org.example.inventorymanagementsystem.infrastructure.event.model;

import lombok.Getter;
import java.time.Instant;

@Getter
public abstract class BaseEvent<T> implements InventoryEvent {
    private final T aggregateId;
    private final Instant timestamp;

    protected BaseEvent(T aggregateId) {
        this.aggregateId = aggregateId;
        this.timestamp = Instant.now();
    }

    @Override
    public Long getAggregateId() {
        return (Long) aggregateId;
    }
}