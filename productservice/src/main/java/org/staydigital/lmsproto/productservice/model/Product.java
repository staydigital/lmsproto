package org.staydigital.lmsproto.productservice.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@ToString
@Entity
public class Product {

    @Id
    private String productId;
    private String productName;
    private String shortDescription;
    private String longDescription;
    private String inventoryId;

}
