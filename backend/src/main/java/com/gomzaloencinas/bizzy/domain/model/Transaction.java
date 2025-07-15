package com.gomzaloencinas.bizzy.domain.model;

import java.time.LocalDateTime;

public abstract class Transaction {
    private String id;
    private LocalDateTime createdAt;
    private String description;
    private double amount;
    private String categoryTransactionId;
    private String userId;
}
