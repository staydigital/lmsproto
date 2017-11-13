package org.staydigital.lmsproto.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.staydigital.lmsproto.productservice.model.Product;
import org.staydigital.lmsproto.productservice.repository.ProductRepository;

@ComponentScan
@EnableAutoConfiguration
public class ApplicationRunner {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ApplicationRunner.class);
        Product product = new Product();
        product.setProductId("ABCD1234");
        product.setProductName("Dan's Book of Writing");
        product.setShortDescription("A book about writing books.");
        product.setLongDescription("In this book about writing books, Dan will show you how to write a book.");
        product.setInventoryId("009178461");

        Product product2 = new Product();
        product2.setProductId("1234ABCD");
        product2.setProductName("Dan's Book of Writing");
        product2.setShortDescription("A book about writing books.");
        product2.setLongDescription("In this book about writing books, Dan will show you how to write a book.");
        product2.setInventoryId("009178461");

        ProductRepository repository = ctx.getBean(ProductRepository.class);
        repository.save(product);
        repository.save(product2);
        for (Product productDetail : repository.findAll()) {
            System.out.println(productDetail.getProductId());
        }
    }
}
