package org.staydigital.lmsproto.productservice.domain;

import org.axonframework.commandhandling.annotation.CommandHandler;
import org.axonframework.eventhandling.annotation.EventHandler;
import org.axonframework.eventsourcing.annotation.AbstractAnnotatedAggregateRoot;
import org.axonframework.eventsourcing.annotation.AggregateIdentifier;
import org.staydigital.lmsproto.productservice.domain.commands.CreateProductCommand;
import org.staydigital.lmsproto.productservice.domain.events.ProductCreatedEvent;

public class Product extends AbstractAnnotatedAggregateRoot<String> {

    private static final long serivalVersionUID = -5977984483620451665L;

    @AggregateIdentifier
    private String id;

    public Product() { }

    @CommandHandler
    public Product(CreateProductCommand command) {
        apply(new ProductCreatedEvent(command.getId(), command.getProductName(), command.getShortDescription(), command.getLongDescription(), command.getInventoryId()));
    }

    @EventHandler
    private void on(ProductCreatedEvent event) {
        this.id = event.getId();
    }
}
