package com.techie.inventoryservice.inventory.service.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.techie.inventoryservice.inventory.service.repository.InventoryRepository;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    public boolean isInStock(String skuCode, int quantity) {

        return inventoryRepository.existsBySkuCodeAndQuantityGreaterThanEqual(skuCode, quantity);
    }
}
