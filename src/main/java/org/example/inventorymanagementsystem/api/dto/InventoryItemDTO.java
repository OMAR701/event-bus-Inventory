package org.example.inventorymanagementsystem.api.dto;

import lombok.Builder;
import lombok.Data;
import org.example.inventorymanagementsystem.domain.enums.InventoryStatus;
import org.example.inventorymanagementsystem.domain.model.InventoryItem;

@Data
@Builder
public class InventoryItemDTO {
    private Long id;
    private Long productId;
    private String productName;
    private String productSku;
    private Long warehouseId;
    private String warehouseName;
    private int quantity;
    private InventoryStatus status;

    public static InventoryItemDTO fromEntity(InventoryItem entity) {
        return InventoryItemDTO.builder()
                .id(entity.getId())
                .productId(entity.getProduct().getId())
                .productName(entity.getProduct().getName())
                .productSku(entity.getProduct().getSku())
                .warehouseId(entity.getWarehouse().getId())
                .warehouseName(entity.getWarehouse().getName())
                .quantity(entity.getQuantity())
                .status(entity.getStatus())
                .build();
    }
}