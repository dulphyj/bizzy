package com.gomzaloencinas.bizzy.infrastructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sale_items")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleItemEntity {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private String id;
    private String productId;
    private int quantity;
    private double price;
    @ManyToOne
    private SaleEntity saleEntity;
}
