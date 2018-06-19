package org.stockHelper.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.stockHelper.entities.Stock;

public interface StockRepository extends JpaRepository<Long, Stock> {
}
