package org.example.inventorymanagementsystem.infrastructure.event.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@AllArgsConstructor
@Setter
public abstract class BaseEvent<T> {

    private final T aggregateId;
    private final Instant timestamp;
    protected BaseEvent(T aggregateId) {
        this.aggregateId = aggregateId;
        this.timestamp = Instant.now();
    }
}
