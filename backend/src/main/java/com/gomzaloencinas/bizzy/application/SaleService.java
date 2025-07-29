package com.gomzaloencinas.bizzy.application;

import com.gomzaloencinas.bizzy.domain.model.Sale;
import com.gomzaloencinas.bizzy.domain.port.SaleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SaleService {
    private final SaleRepository saleRepository;

    public Sale save(Sale sale) {
        try {
            return saleRepository.save(sale);
        } catch (Exception e) {
            throw new RuntimeException("Error saving sale", e);
        }
    }

    public Iterable<Sale> findAll(){
        try {
            return saleRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException("Error finding all sales", e);
        }
    }

    public Sale findById(String id) {
        try {
            return saleRepository.findById(id);
        } catch (Exception e) {
            throw new RuntimeException("Error finding sale by id: " + id, e);
        }
    }

    public void deleteById(String id) {
        try {
            saleRepository.deleteById(id);
        } catch (Exception e) {
            throw new RuntimeException("Error deleting sale by id: " + id, e);
        }
    }
}
