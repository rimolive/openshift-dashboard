package org.openshift.dashboard.openshift;

import android.util.Log;

import io.fabric8.openshift.client.DefaultOpenShiftClient;
import io.fabric8.openshift.client.OpenShiftConfig;
import io.fabric8.openshift.client.OpenShiftConfigBuilder;

/**
 * Created by rmartine on 3/26/16.
 */
public class AndroidOpenShiftClient extends DefaultOpenShiftClient {

    private static AndroidOpenShiftClient instance;

    public static AndroidOpenShiftClient getOpenShiftClient() {
        if (instance == null) {
            Log.d(instance.getClass().getName(), "Creating OpenShift client..");
            OpenShiftConfig config = new OpenShiftConfigBuilder()
                    .withMasterUrl("https://192.168.1.131:8443")
                    .withUsername("rmartine")
                    .withPassword("rmartine").build();

            instance = new AndroidOpenShiftClient(config);
        }
        Log.d(instance.getClass().getName(), "Getting OpenShift client..");
        return instance;
    }

    public AndroidOpenShiftClient(OpenShiftConfig config) {
        super(config);
    }

}
