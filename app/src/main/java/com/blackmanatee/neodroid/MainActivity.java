package com.blackmanatee.neodroid;

import android.os.Bundle;
import android.app.*;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.neodrive);
		setTheme(android.R.style.Theme_DeviceDefault);
    }
}
