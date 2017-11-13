package org.staydigital.lmsproto.productservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.staydigital.lmsproto.productservice.model.Product;

@Repository
public interface ProductRepository extends CrudRepository <Product, String> {
}
