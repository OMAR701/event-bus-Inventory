package org.example.inventorymanagementsystem.domain.model;

import java.util.HashSet;
import java.util.Set;

public class Supplier extends BaseEntity<Long>{
    private String name;
    private String contactEmail;
    private String phone;
    private Set<Product> suppliedProducts = new HashSet<>();
}
