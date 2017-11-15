package org.staydigital.lmsproto.productservice;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.staydigital.lmsproto.productservice.domain.commands.CreateProductCommand;
import org.staydigital.lmsproto.productservice.repository.ProductEntry;
import org.staydigital.lmsproto.productservice.repository.ProductRepository;

@ComponentScan
@EnableAutoConfiguration
public class ApplicationRunner {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ApplicationRunner.class);
        CommandGateway cg = ctx.getBean(CommandGateway.class);

        cg.send(new CreateProductCommand("ABCD1234",
                "Dan's Book of Writing",
                "A book about writing books.",
                "In this book about writing books, Dan will show you how to write a book.",
                "009178461"));

        ProductRepository repository = ctx.getBean(ProductRepository.class);
        for (ProductEntry productEntry : repository.findAll()) {
            System.out.println(productEntry.getId());
        }
    }
}
