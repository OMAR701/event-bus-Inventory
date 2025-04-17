package org.example.inventorymanagementsystem.infrastructure.event.listener;

import org.example.inventorymanagementsystem.infrastructure.event.model.InventoryEvent;
import org.example.inventorymanagementsystem.infrastructure.event.model.LowStockAlertEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class InventoryEventListener {

    @EventListener
    public void handleInventoryEvent(InventoryEvent event) {
        if (event instanceof LowStockAlertEvent lowStockEvent) {
            System.out.printf("Low stock alert: %s (Remaining: %d)%n",
                    lowStockEvent.getProductName(), lowStockEvent.getRemainingQuantity());
        }
    }
}