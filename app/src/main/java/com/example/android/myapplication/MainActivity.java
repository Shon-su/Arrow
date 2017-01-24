package com.example.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView textview = (TextView) findViewById(R.id.textView);
                final TextView textview2 = (TextView) findViewById(R.id.textView2);
                textview.setText(getString(R.string.title));
                textview2.setText(getString(R.string.bottom));
                button.setEnabled(false);
            }
    });
}
}
