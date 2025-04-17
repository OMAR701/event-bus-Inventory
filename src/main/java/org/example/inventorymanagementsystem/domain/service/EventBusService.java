package org.example.inventorymanagementsystem.domain.service;

import org.example.inventorymanagementsystem.infrastructure.event.model.InventoryEvent;

import java.util.EventListener;

public interface EventBusService {
    void publishEvent(InventoryEvent event);
    void subscribe(String topic, EventListener listener);
}