package com.javaacademy.ahop;

import lombok.Data;
import lombok.NonNull;

import java.math.BigDecimal;

@Data
public class Product {
    private @NonNull BigDecimal price;
    private @NonNull String name;
}
