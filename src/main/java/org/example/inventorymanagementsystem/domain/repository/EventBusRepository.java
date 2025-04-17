package org.example.inventorymanagementsystem.domain.repository;


import org.example.inventorymanagementsystem.infrastructure.event.model.InventoryEvent;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventBusRepository {
    void publish(InventoryEvent event);
    List<InventoryEvent> findByAggregateId(Long aggregateId);
}