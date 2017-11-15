package org.staydigital.lmsproto.productservice.domain.events;

import lombok.Value;

@Value
public class ProductCreatedEvent implements ProductEvent {

    private final String id;
    private final String productName;
    private final String shortDescription;
    private final String longDescription;
    private final String inventoryId;

}
