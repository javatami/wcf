package com.tami.wcf.featurerequests.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.LinkedList;

@Data
@Entity
public class Client {

    @Id
    @GeneratedValue
    private Long clientId;
    private String clientName;
    private LinkedList<FeatureRequest> features;

    public Client() {}

    public Client(String clientName, LinkedList<FeatureRequest> features) {
        this.clientName = clientName;
        this.features = features;
    }

}
