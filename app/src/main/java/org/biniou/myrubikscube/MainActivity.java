package org.biniou.myrubikscube;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    //private MyGLSurfaceView mGLView;
    private TextView title;
    private Button start;

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
        start.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Toast.makeText(MainActivity.this, "Click zy voir !", Toast.LENGTH_LONG).show();
                return true;
            }
        });
        start.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                title.setText("Hahahah");
            }
        });

    }

    public void onClick(View view) {
        title.setText("Finally");
        Toast.makeText(this, "Tu vas cliquer oui !", Toast.LENGTH_LONG).show();
    }
}
