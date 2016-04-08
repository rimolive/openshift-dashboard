package org.openshift.dashboard;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;

import org.openshift.dashboard.adapter.ExpandedMenuModel;
import org.openshift.dashboard.adapter.UserExpandableListAdapter;
import org.openshift.dashboard.listener.AddToProjectClickListener;
import org.openshift.dashboard.listener.NavBarNavigationItemSelectedListener;
import org.openshift.dashboard.openshift.AndroidOpenShiftClient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    UserExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    public DrawerLayout drawer;

    private AndroidOpenShiftClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /* --- IMPORTANT --- */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* --- IMPORTANT --- */

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.add_to_project);
        fab.setOnClickListener(new AddToProjectClickListener());

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, (Toolbar) findViewById(R.id.toolbar), R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavBarNavigationItemSelectedListener(this));

//        expListView = (ExpandableListView) findViewById(R.id.expandableListView);
//        prepareListData();
//        listAdapter = new UserExpandableListAdapter(this, listDataHeader, listDataChild, expListView);
//        expListView.setAdapter(listAdapter);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void prepareListData() {
        List<ExpandedMenuModel> listDataHeader = new ArrayList<ExpandedMenuModel>();
        HashMap<ExpandedMenuModel, List<String>> listDataChild = new HashMap<ExpandedMenuModel, List<String>>();

        ExpandedMenuModel item1 = new ExpandedMenuModel();
        item1.setIconName("ricardo.martinelli.oliveira@gmail.com");
        // Adding data header
        listDataHeader.add(item1);

        ExpandedMenuModel item2 = new ExpandedMenuModel();
        item2.setIconName("heading2");
        item2.setIconImg(R.drawable.ic_menu_camera);
        listDataHeader.add(item2);

        // Adding child data
        List<String> heading1 = new ArrayList<>();
        heading1.add("ricardo.martinelli.oliveira@gmail.com");
        heading1.add("rhn-support-rmartine");

        List<String> heading2 = new ArrayList<>();
        heading2.add("Submenu of item 2");
        heading2.add("Submenu of item 2");
        heading2.add("Submenu of item 2");

        listDataChild.put(listDataHeader.get(0), heading1);// Header, Child data
        listDataChild.put(listDataHeader.get(1), heading2);
    }

    public void changeScreen(View c) {
        setContentView(R.layout.content_over_view);
    }

}
