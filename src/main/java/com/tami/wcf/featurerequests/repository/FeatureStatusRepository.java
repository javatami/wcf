package com.tami.wcf.featurerequests.repository;

import com.tami.wcf.featurerequests.model.FeatureStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeatureStatusRepository extends JpaRepository<FeatureStatus, Long> {
}
