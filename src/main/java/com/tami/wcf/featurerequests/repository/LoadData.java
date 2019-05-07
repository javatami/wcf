package com.tami.wcf.featurerequests.repository;

import com.tami.wcf.featurerequests.model.Client;
import com.tami.wcf.featurerequests.model.FeatureRequest;
import com.tami.wcf.featurerequests.model.ProductArea;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;

@Configuration
@Slf4j
public class LoadData {

    @Bean
    CommandLineRunner initRepositories(ClientRepository clientRepository,
                                  ProductAreaRepository productAreaRepository,
                                       FeatureRequestRepository featureRequestRepository) {
        return args -> {
            ArrayList<Client> clients = new ArrayList<>();
            clients.add(clientRepository.save(new Client("Client A")));
            clients.add(clientRepository.save(new Client("Client B")));
            clients.add(clientRepository.save(new Client("Client C")));
            log.info("Loaded clients:" + clients.toString());
            ArrayList<ProductArea> productAreas = new ArrayList<>();
            productAreas.add(productAreaRepository.save(new ProductArea("Policies")));
            productAreas.add(productAreaRepository.save(new ProductArea("Billing")));
            productAreas.add(productAreaRepository.save(new ProductArea("Claims")));
            productAreas.add(productAreaRepository.save(new ProductArea("Reports")));
            log.info("Loaded productAreas:" + productAreas.toString());
            ArrayList<FeatureRequest> features = new ArrayList<>();
            features.add(featureRequestRepository.save(new FeatureRequest("Add ability to sort to policy lists", "The data table does not provide the ability to sort by all columns.", 1, clients.get(0), LocalDate.now(), productAreas.get(0))));
            features.add(featureRequestRepository.save(new FeatureRequest("Another fantastic feature request", "I am inventing awesome feature requests.", 2, clients.get(0), LocalDate.now(), productAreas.get(2))));
            features.add(featureRequestRepository.save(new FeatureRequest("Add ability to cancel billing", "Please allow the client to cancel a billing request with supervisor override", 1, clients.get(1), LocalDate.now(), productAreas.get(1))));
            features.add(featureRequestRepository.save(new FeatureRequest("New report about WIP", "We need a new report that specifies WIP.", 1, clients.get(2), LocalDate.now(), productAreas.get(3))));
            log.info("Loaded featureRequests:" + features);
        };
    }
}
