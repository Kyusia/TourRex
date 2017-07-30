package com.kyu.tourrex;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView englandCountry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        englandCountry =  (TextView) findViewById(R.id.buttonEngland);
        englandCountry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent englandActivity = new Intent(v.getContext(), BasicActivity.class);
                startActivityForResult(englandActivity, 0);
            }
        });
    }
}
