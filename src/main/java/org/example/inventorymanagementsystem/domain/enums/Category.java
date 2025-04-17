package org.example.inventorymanagementsystem.domain.enums;

import lombok.Getter;

@Getter
public enum Category {
    ELECTRONICS("Electronics"),
    CLOTHING("Clothing & Apparel"),
    FOOD("Food & Beverages"),
    FURNITURE("Furniture"),
    OFFICE_SUPPLIES("Office Supplies"),
    TOOLS("Tools & Hardware"),
    OTHER("Other");

    private final String displayName;

    Category(String displayName) {
        this.displayName = displayName;
    }

    public static Category fromDisplayName(String displayName) {
        for (Category category : values()) {
            if (category.displayName.equalsIgnoreCase(displayName)) {
                return category;
            }
        }
        throw new IllegalArgumentException("Unknown category: " + displayName);
    }
}