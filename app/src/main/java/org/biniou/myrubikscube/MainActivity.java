package org.biniou.myrubikscube;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    //private MyGLSurfaceView mGLView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create a GLSurfaceView instance and set it
        // as the ContentView for this Activity.
        //mGLView = new MyGLSurfaceView(this);
        //setContentView(mGLView);
        setContentView(R.layout.activity_main);
    }

}
