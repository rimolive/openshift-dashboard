package org.openshift.dashboard.openshift;

import io.fabric8.openshift.client.OpenShiftConfig;
import io.fabric8.openshift.client.OpenShiftConfigBuilder;

/**
 * Created by rmartine on 3/26/16.
 */
public class OpenShiftAdapter {

    private AndroidOpenShiftClient client;

    public OpenShiftAdapter(String masterUrl, String username, String password) {
        OpenShiftConfigBuilder builder = new OpenShiftConfigBuilder()
                .withMasterUrl(masterUrl)
                .withUsername(username)
                .withPassword(password);

        builder.build();
    }

    public AndroidOpenShiftClient getClient() {
        return client;
    }

}
