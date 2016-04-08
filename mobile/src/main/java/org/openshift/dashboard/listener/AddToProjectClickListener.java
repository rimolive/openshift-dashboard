package org.openshift.dashboard.listener;

import android.support.design.widget.Snackbar;
import android.view.View;

/**
 * Created by rmartine on 3/29/16.
 */
public class AddToProjectClickListener implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        Snackbar
                .make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }
}
