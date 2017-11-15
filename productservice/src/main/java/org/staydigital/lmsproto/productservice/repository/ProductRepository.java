package org.staydigital.lmsproto.productservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository <ProductEntry, String> {
}
