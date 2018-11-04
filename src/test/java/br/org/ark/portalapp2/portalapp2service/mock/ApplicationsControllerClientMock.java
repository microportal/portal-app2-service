package br.org.ark.portalapp2.portalapp2service.mock;

import org.microportal.api.client.ApplicationsControllerClient;
import org.microportal.api.model.ApplicationBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ApplicationsControllerClientMock implements ApplicationsControllerClient {

    public List<ApplicationBase> findAll() {
        return new ArrayList<>();
    }

    public List<ApplicationBase> findServices() {
        return new ArrayList<>();
    }

    public ApplicationBase findById(String applicationId) {
        return new ApplicationBase();
    }

    public Optional<ApplicationBase> registerApplication(ApplicationBase applicationDocument) {
        return Optional.empty();
    }

    public ApplicationBase updateApplication(String applicationId, ApplicationBase applicationDocument) {
        return new ApplicationBase();
    }

    public void unregister(String applicationId) {
        // do nothing
    }
}
