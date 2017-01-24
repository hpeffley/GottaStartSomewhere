package edu.dtcc.hpeffley.gottastartsomewhere;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button process;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set up the process button
        Button btn = (Button) findViewById(R.id.btnProcess);
        // Set up the on click action of the process button
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                EditText edit = (EditText) findViewById(R.id.tvEdit);
                TextView display = (TextView) findViewById(R.id.tvDisplay);
                display.setText("Hello " + edit.getText() + "!");
            }
        });

        //String editt = tvEdit;
        //message.setText(edit);
    }



}
