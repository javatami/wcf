package com.tami.wcf.featurerequests.model;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class FeatureStatus {

    @Id
    @GeneratedValue
    private Long featureStatusId;

    @Column(name = "status")
    private String status;

    public FeatureStatus(String status) {
        this.status = status;
    }

    public FeatureStatus() {}
}
