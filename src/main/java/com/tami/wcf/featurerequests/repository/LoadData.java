package com.tami.wcf.featurerequests.repository;

import com.tami.wcf.featurerequests.model.Client;
import com.tami.wcf.featurerequests.model.ProductArea;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
@Slf4j
public class LoadData {

    @Bean
    CommandLineRunner initRepositories(ClientRepository clientRepository,
                                  ProductAreaRepository productAreaRepository) {
        return args -> {
            ArrayList<Client> clients = new ArrayList<>();
            clients.add(clientRepository.save(new Client("Client A")));
            clients.add(clientRepository.save(new Client("Client A")));
            clients.add(clientRepository.save(new Client("Client A")));
            log.info("Loaded clients:" + clients.toString());
            ArrayList<ProductArea> productAreas = new ArrayList<>();
            productAreas.add(productAreaRepository.save(new ProductArea("Policies")));
            productAreas.add(productAreaRepository.save(new ProductArea("Billing")));
            productAreas.add(productAreaRepository.save(new ProductArea("Claims")));
            productAreas.add(productAreaRepository.save(new ProductArea("Reports")));
            log.info("Loaded productAreas:" + productAreas.toString());
        };
    }
}
