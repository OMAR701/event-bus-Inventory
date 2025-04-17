package org.example.inventorymanagementsystem.domain.service;

import org.example.inventorymanagementsystem.domain.model.InventoryItem;

public interface InventoryService {
    InventoryItem updateStock(String sku, int quantityChange, Long warehouseId);
    void processLowStockAlerts();
}