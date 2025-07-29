package com.gomzaloencinas.bizzy.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Transaction {
    private String id;
    private LocalDateTime createdAt;
    private String description;
    private double amount;
    private String categoryTransactionId;
}
