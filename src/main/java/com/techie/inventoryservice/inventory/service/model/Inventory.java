package com.techie.inventoryservice.inventory.service.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tbl_inventory")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Builder
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String skuCode;
    private Integer quantity;

}
