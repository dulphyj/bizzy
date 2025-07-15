package com.gomzaloencinas.bizzy.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleItem {
    private String id;
    private Integer productId;
    private int quantity;
    private double price;

    public double getTotalPrice() {
        return price * quantity;
    }

}
