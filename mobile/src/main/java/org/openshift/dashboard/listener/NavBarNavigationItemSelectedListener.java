package org.openshift.dashboard.listener;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;

import org.openshift.dashboard.R;

/**
 * Created by rmartine on 4/2/16.
 */
public class NavBarNavigationItemSelectedListener
        implements NavigationView.OnNavigationItemSelectedListener {

    private AppCompatActivity context;

    public NavBarNavigationItemSelectedListener(AppCompatActivity context) {
        this.context = context;
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch(id) {
            case R.id.nav_overview:
                break;
//            case R.id.nav_browse:
//                break;
//            case R.id.nav_builds:
//                break;
//            case R.id.nav_deployments:
//                break;
//            case R.id.nav_events:
//                break;
//            case R.id.nav_imagestreams:
//                break;
//            case R.id.nav_pods:
//                break;
//            case R.id.nav_routes:
//                break;
//            case R.id.nav_services:
//                break;
//            case R.id.nav_storage:
//                break;
//            case R.id.nav_settings:
//                break;
            default:
                Log.d(this.getClass().getName(), "No action called...");
        }

        DrawerLayout drawer = (DrawerLayout) context.findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
