package org.example.inventorymanagementsystem.domain.enums;


import lombok.Getter;

@Getter
public enum InventoryStatus {
    IN_STOCK("In Stock"),
    LOW_STOCK("Low Stock"),
    OUT_OF_STOCK("Out of Stock");

    private final String displayName;

    InventoryStatus(String displayName) {
        this.displayName = displayName;
    }

    public static InventoryStatus fromDisplayName(String displayName){
        for (InventoryStatus inventoryStatus: values()){
            if (inventoryStatus.displayName.equalsIgnoreCase(displayName)) {
                return inventoryStatus;
            }
        }
        throw new IllegalArgumentException("Unknown inventoryStatus: " + displayName);
    }
}
