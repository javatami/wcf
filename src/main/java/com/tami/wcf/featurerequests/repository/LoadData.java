package com.tami.wcf.featurerequests.repository;

import com.tami.wcf.featurerequests.model.Client;
import com.tami.wcf.featurerequests.model.ProductArea;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadData {

    @Bean
    CommandLineRunner initClients(ClientRepository clientRepository,
                                  ProductAreaRepository productAreaRepository,
                                  FeatureStatusRepository featureStatusRepository) {
        return args -> {
           log.info("Loading " + clientRepository.save(new Client("Client A", null)));
           log.info("Loading " + clientRepository.save(new Client("Client B", null)));
           log.info("Loading " + clientRepository.save(new Client("Client C", null)));
           log.info("Loading " + productAreaRepository.save(new ProductArea("Policies")));
           log.info("Loading " + productAreaRepository.save(new ProductArea("Billing")));
           log.info("Loading " + productAreaRepository.save(new ProductArea("Claims")));
           log.info("Loading " + productAreaRepository.save(new ProductArea("Reports")));
        };
    }
}
