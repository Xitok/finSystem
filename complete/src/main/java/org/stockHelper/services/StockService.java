package org.stockHelper.services;

import org.stockHelper.dto.StockDTO;

public interface StockService {
    void createStock(StockDTO createStockDTO);

    StockDTO getStock(Long idStock);

    StockDTO updateStock(StockDTO stockDTO);

    void deleteStock(Long idStock);

}
