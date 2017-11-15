package org.staydigital.lmsproto.productservice.domain.commands;

import lombok.Value;

import javax.validation.constraints.NotNull;

@Value
public class CreateProductCommand {

    @NotNull
    private final String id;
    @NotNull
    private final String productName;
    @NotNull
    private final String shortDescription;
    @NotNull
    private final String longDescription;
    @NotNull
    private final String inventoryId;
}
