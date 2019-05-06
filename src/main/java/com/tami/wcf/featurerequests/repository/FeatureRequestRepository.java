package com.tami.wcf.featurerequests.repository;

import com.tami.wcf.featurerequests.model.FeatureRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeatureRequestRepository extends JpaRepository<FeatureRequest, Long> {
}
