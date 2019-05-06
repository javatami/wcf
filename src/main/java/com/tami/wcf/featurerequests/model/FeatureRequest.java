package com.tami.wcf.featurerequests.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Data
@Entity
public class FeatureRequest {

    @Id
    @GeneratedValue
    private Long requestId;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "clientId")
    private Client client;

    @Column(name = "target_date")
    private LocalDate targetDate;

    @ManyToOne
    @JoinColumn(name = "productId")
    private ProductArea productArea;

    public FeatureRequest() {}

    public FeatureRequest(String title, String description, Client client, LocalDate targetDate, ProductArea productArea) {
        this.title = title;
        this.description = description;
        this.client = client;
        this.targetDate = targetDate;
        this.productArea = productArea;
    }


}
