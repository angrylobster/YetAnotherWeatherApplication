package com.yetanotherweatherapplication.angrylobster.yetanotherweatherapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        String loc = getIntent().getStringExtra("location");
        Toast.makeText(this, loc, Toast.LENGTH_SHORT).show();
    }
}
