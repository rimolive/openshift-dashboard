package org.openshift.dashboard;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MyDisplayActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        TextView mTextView = (TextView) findViewById(R.id.text);
    }
}
