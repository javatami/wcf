package com.tami.wcf.featurerequests.controller;

import com.tami.wcf.featurerequests.exceptions.FeatureRequestNotFoundException;
import com.tami.wcf.featurerequests.model.FeatureRequest;
import com.tami.wcf.featurerequests.repository.FeatureRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class FeatureRequestController {

    @Autowired
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

    @RequestMapping("/featurerequests")
    List<FeatureRequest> findAll() {
        return repository.findAll();
    }
    public FeatureRequestRepository getRepository() {
        return repository;
    }

    public void setRepository(FeatureRequestRepository repository) {
        this.repository = repository;
    }
}
