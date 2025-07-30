package com.gomzaloencinas.bizzy.infrastructure.entity;

import com.gomzaloencinas.bizzy.domain.model.SaleItem;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "sales")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleEntity {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private String id;
    @CreationTimestamp
    private LocalDateTime date;
    @OneToMany(mappedBy = "saleEntity", cascade = CascadeType.PERSIST)
    private List<SaleItemEntity> saleItems;
}
