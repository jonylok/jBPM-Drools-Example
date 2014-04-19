package org.drools.examples;

import org.kie.api.KieServices;
import org.kie.api.builder.ReleaseId;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class DroolsMain {

	public static void main(String[] args) {
		
		KieServices kServices = KieServices.Factory.get();
		ReleaseId releaseId = kServices.newReleaseId( "org.kie.example", "project1", "LATEST" );
		KieContainer kContainer = kServices.newKieContainer( releaseId );
		KieSession ksession = kContainer.newKieSession("defaultKieSession");
		ksession.fireAllRules();
        ksession.dispose();		
	}

}