package com.techie.inventoryservice.inventory.service.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.techie.inventoryservice.inventory.service.service.InventoryService;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping("/isExist")
    @ResponseStatus(HttpStatus.OK)
    public boolean isProductAvailable(@RequestParam String skuCode, @RequestParam Integer quantity) {

        return inventoryService.isInStock(skuCode, quantity);
    }
}
