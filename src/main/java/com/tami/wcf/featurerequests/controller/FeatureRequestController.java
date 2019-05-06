package com.tami.wcf.featurerequests.controller;

import com.tami.wcf.featurerequests.exceptions.FeatureRequestNotFoundException;
import com.tami.wcf.featurerequests.model.FeatureRequest;
import com.tami.wcf.featurerequests.repository.FeatureRequestRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeatureRequestController {

    private FeatureRequestRepository repository;

    @PostMapping("/featurerequests")
    FeatureRequest newFeatureRequest(@RequestBody FeatureRequest featureRequest) {
        return repository.save(featureRequest);
    }

    @GetMapping("/featurerequests/{id}")
    FeatureRequest single(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new FeatureRequestNotFoundException("Unable to locate feature request with id:" + id ));
    }

    public FeatureRequestRepository getRepository() {
        return repository;
    }

    public void setRepository(FeatureRequestRepository repository) {
        this.repository = repository;
    }
}
