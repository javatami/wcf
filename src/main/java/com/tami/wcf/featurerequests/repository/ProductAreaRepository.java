package com.tami.wcf.featurerequests.repository;

import com.tami.wcf.featurerequests.model.ProductArea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductAreaRepository extends JpaRepository<ProductArea, Long> {
}
