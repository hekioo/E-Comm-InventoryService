package com.techie.inventoryservice.inventory.service.repository;

import com.techie.inventoryservice.inventory.service.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
//checking stock
    boolean existsBySkuCodeAndQuantityGreaterThanEqual(String skuCode, int quantity);
}
