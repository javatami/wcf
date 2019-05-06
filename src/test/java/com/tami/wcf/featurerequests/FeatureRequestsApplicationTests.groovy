package com.tami.wcf.featurerequests;

import com.tami.wcf.featurerequests.controller.FeatureRequestController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner
import spock.lang.Specification;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FeatureRequestsApplicationTests extends Specification {

	@Autowired
	FeatureRequestController featureRequestController

	@Test
	public void contextLoads() {
		expect: "The feature request controller to have loaded its context"
		featureRequestController != null
	}

}
