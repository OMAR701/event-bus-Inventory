package org.example.inventorymanagementsystem.domain.repository;


import org.example.inventorymanagementsystem.domain.enums.InventoryStatus;
import org.example.inventorymanagementsystem.domain.model.InventoryItem;
import org.example.inventorymanagementsystem.domain.model.Product;
import org.example.inventorymanagementsystem.domain.model.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InventoryRepository extends JpaRepository<InventoryItem, Long> {
    List<InventoryItem> findByStatus(InventoryStatus status);
    Optional<InventoryItem> findByProductAndWarehouse(Product product, Warehouse warehouse);
}