package org.staydigital.lmsproto.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.staydigital.lmsproto.productservice.repository.ProductEntry;
import org.staydigital.lmsproto.productservice.repository.ProductRepository;

@RestController
@RequestMapping("/api")
public class ProductController {
    private final ProductRepository repo;

    @Autowired
    public ProductController(ProductRepository repo) {
        this.repo = repo;
    }

    @RequestMapping(value = "product", method = RequestMethod.GET)
    public Iterable findAll() {
        return repo.findAll();
    }

    @RequestMapping(value = "product/{id}", method = RequestMethod.GET)
    public ProductEntry getProductById(@PathVariable String id) {
        return repo.findOne(id);
    }

}
