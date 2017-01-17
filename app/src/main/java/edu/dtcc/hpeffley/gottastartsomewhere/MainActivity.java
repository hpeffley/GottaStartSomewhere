package edu.dtcc.hpeffley.gottastartsomewhere;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView message = (TextView) findViewById(R.id.tvDisplay);
        EditText edit = (EditText) findViewById(R.id.tvEdit);
        //String editt = tvEdit;
        //message.setText(edit);
    }
}
