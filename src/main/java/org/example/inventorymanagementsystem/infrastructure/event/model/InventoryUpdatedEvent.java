package org.example.inventorymanagementsystem.infrastructure.event.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.inventorymanagementsystem.domain.enums.InventoryStatus;




@Getter
@Setter
public class InventoryUpdatedEvent extends BaseEvent<Long> implements InventoryEvent{


    private final String sku;
    private final int newQuantity;
    private final InventoryStatus status;

    public InventoryUpdatedEvent(Long aggregateId, String sku, int newQuantity, InventoryStatus status) {
        super(aggregateId);
        this.sku = sku;
        this.newQuantity = newQuantity;
        this.status = status;
    }
}
