package br.com.fiap.epicinvest.stock;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<stock, Long> {
    
}
