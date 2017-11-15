package org.staydigital.lmsproto.productservice.repository;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
@Data
public class ProductEntry {

    @Id
    private String id;
    private String productName;
    private String shortDescription;
    private String longDescription;
    private String inventoryId;

}