package com.gomzaloencinas.bizzy.domain.port;

import com.gomzaloencinas.bizzy.domain.model.Sale;

public interface SaleRepository {
    Sale save(Sale sale);
    Iterable<Sale> findAll();
    Sale findById(String id);
    void deleteById(String id);
}
