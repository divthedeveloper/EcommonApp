package com.apcsa_summer_hw.dk.ecomonapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button existingDataSet;
    private Button createNewDataSet;
    private Button dataSet1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        dataSet1 = (Button)findViewById(R.id.button4);

        //if the Data Set 1 Button is clicked, it will take us to next activity
        dataSet1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent2);
            }
        });
    }
}
