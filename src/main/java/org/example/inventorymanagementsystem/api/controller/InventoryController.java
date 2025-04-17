package org.example.inventorymanagementsystem.api.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.inventorymanagementsystem.api.dto.InventoryUpdateRequest;
import org.example.inventorymanagementsystem.api.dto.InventoryItemDTO;
import org.example.inventorymanagementsystem.domain.service.InventoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {
    private final InventoryService inventoryService;

    @PutMapping("/update")
    public ResponseEntity<InventoryItemDTO> updateInventory(@RequestBody @Valid InventoryUpdateRequest request) {
        var updatedItem = inventoryService.updateStock(
                request.getSku(),
                request.getQuantityChange(),
                request.getWarehouseId()
        );

        return ResponseEntity.ok(InventoryItemDTO.fromEntity(updatedItem));
    }
}