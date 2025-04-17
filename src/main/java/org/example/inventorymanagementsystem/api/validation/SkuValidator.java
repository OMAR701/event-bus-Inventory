package org.example.inventorymanagementsystem.api.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class SkuValidator implements ConstraintValidator<ValidSku, String> {
    @Override
    public boolean isValid(String sku, ConstraintValidatorContext context) {
        return sku != null && sku.matches("[A-Z]{2}-\\d{6}");
    }
}