package org.example.inventorymanagementsystem.infrastructure.event.publisher;

import lombok.RequiredArgsConstructor;
import org.example.inventorymanagementsystem.domain.service.EventBusService;
import org.example.inventorymanagementsystem.infrastructure.event.model.InventoryEvent;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventPublisherService {
    private final EventBusService eventBusService;

    public void publishEvent(InventoryEvent event) {
        eventBusService.publishEvent(event);
    }
}