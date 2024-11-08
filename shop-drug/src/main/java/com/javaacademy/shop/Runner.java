package com.javaacademy.shop;

import com.javaacademy.ahop.Cashier;
import com.javaacademy.shop.drug.Drug;
import lombok.extern.slf4j.Slf4j;

import static java.math.BigDecimal.valueOf;

@Slf4j
public class Runner {
    public static void main(String[] args) {
        Drug drug = new Drug(valueOf(250), "Парацетамол", false);
        log.info("создан товар - {}", drug);

        Cashier cashier = new Cashier();
        cashier.addProduct(drug);
        cashier.prtProducts();
    }
}
