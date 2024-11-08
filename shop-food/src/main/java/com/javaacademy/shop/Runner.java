package com.javaacademy.shop;

import com.javaacademy.ahop.Cashier;
import com.javaacademy.shop.food.Food;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class Runner {
    public static void main(String[] args) {
        Food apple = new Food(BigDecimal.valueOf(100), "Яблоко", 50);
        log.info("создан товар - {}", apple);
        Food pizza = new Food(BigDecimal.valueOf(500), "Пицца", 549);
        log.info("создан товар - {}", pizza);

        Cashier cashier = new Cashier();
        cashier.addProduct(apple);
        cashier.addProduct(pizza);
        cashier.prtProducts();
    }
}
