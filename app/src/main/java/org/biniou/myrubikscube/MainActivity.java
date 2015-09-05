package org.biniou.myrubikscube;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    //private MyGLSurfaceView mGLView;
    private TextView title;
    private Button start;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create a GLSurfaceView instance and set it
        // as the ContentView for this Activity.
        //mGLView = new MyGLSurfaceView(this);
        //setContentView(mGLView);
        setContentView(R.layout.activity_main);

        title = (TextView) findViewById(R.id.textView);
        start = (Button) findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Click zy voir !", Toast.LENGTH_LONG).show();
                title.setText(getTitle() + " " + ++count);
            }
        });

    }
}
