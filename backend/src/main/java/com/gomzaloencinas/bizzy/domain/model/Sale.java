package com.gomzaloencinas.bizzy.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Sale {
    private String id;
    private LocalDateTime date;
    private List<SaleItem> items;

    public Sale(){
        items = new ArrayList<>();
    }

    public double getTotalPrice() {
        return items.stream()
                .mapToDouble(SaleItem::getTotalPrice)
                .sum();
    }

}
