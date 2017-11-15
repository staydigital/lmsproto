package org.staydigital.lmsproto.productservice.repository;

import org.axonframework.eventhandling.annotation.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.staydigital.lmsproto.productservice.domain.events.ProductCreatedEvent;

@Component
public class ProductEntryEventHandler {

    private final ProductRepository productEntryRepository;

    @Autowired
    public ProductEntryEventHandler(ProductRepository productEntryRepository) {
        this.productEntryRepository = productEntryRepository;
    }

    @EventHandler
    private void on(ProductCreatedEvent event) {
        ProductEntry product = new ProductEntry();
        product.setId(event.getId());
        product.setInventoryId(event.getInventoryId());
        product.setLongDescription(event.getLongDescription());
        product.setProductName(event.getProductName());
        product.setShortDescription(event.getShortDescription());
        productEntryRepository.save(product);
    }

}
