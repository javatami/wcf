package com.tami.wcf.featurerequests.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@Entity
public class FeatureRequest {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
    private Client client;
    private LocalDate targetDate;
    private ProductArea productArea;

    FeatureRequest() {}

    FeatureRequest(String title, String description, Client client, LocalDate targetDate, ProductArea productArea) {
        this.title = title;
        this.description = description;
        this.client = client;
        this.targetDate = targetDate;
        this.productArea = productArea;
    }


}
