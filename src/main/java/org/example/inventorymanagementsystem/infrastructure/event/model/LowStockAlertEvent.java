package org.example.inventorymanagementsystem.infrastructure.event.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
public class LowStockAlertEvent extends BaseEvent<Long> implements InventoryEvent{


    private final String sku;
    private final String productName;
    private final int remainingQuantity;

    public LowStockAlertEvent(Long aggregateId, String sku, String productName, int remainingQuantity) {
        super(aggregateId);
        this.sku = sku;
        this.productName = productName;
        this.remainingQuantity = remainingQuantity;
    }
}
