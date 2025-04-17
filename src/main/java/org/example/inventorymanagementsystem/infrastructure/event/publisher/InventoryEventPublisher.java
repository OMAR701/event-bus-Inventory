package org.example.inventorymanagementsystem.infrastructure.event.publisher;

import lombok.RequiredArgsConstructor;
import org.example.inventorymanagementsystem.infrastructure.event.model.LowStockAlertEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InventoryEventPublisher {

    private final ApplicationEventPublisher eventPublisher;

    public void publishLowStockEvent(LowStockAlertEvent event) {
        eventPublisher.publishEvent(event);
    }
}
