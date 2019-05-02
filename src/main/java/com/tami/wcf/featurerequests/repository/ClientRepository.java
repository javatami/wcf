package com.tami.wcf.featurerequests.repository;

import com.tami.wcf.featurerequests.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
