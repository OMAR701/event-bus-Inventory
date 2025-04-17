package org.example.inventorymanagementsystem.infrastructure.event.model;

import java.time.Instant;

public interface InventoryEvent {

    Long getAggregateId();
    Instant getTimestamp();
}
