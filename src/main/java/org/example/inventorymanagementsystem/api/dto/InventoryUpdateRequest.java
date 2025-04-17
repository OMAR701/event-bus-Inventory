package org.example.inventorymanagementsystem.api.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InventoryUpdateRequest {

    @NotBlank(message = "SKU cannot be empty")
    private String sku;

    @NotNull(message = "Quantity change must be specified")
    private Integer quantityChange;

    @NotNull(message = "Warehouse ID is required")
    @Min(value = 1, message = "Warehouse ID must be positive")
    private Long warehouseId;
}
