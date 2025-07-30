package com.gomzaloencinas.bizzy.infrastructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "expense")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExpenseEntity {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private String id;
    @CreationTimestamp
    private LocalDateTime createdAt;
    private String description;
    private double amount;
    @ManyToOne
    private String categoryTransactionId;
}
