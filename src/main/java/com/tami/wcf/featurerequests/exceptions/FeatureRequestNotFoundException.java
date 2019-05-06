package com.tami.wcf.featurerequests.exceptions;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FeatureRequestNotFoundException extends RuntimeException {

    private Long id;
    public FeatureRequestNotFoundException(String message) {
        super(message);
        log.warn(message);
    }
}
