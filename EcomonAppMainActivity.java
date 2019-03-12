package com.apcsa_summer_hw.dk.ecomonapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EcomonAppMainActivity extends AppCompatActivity {

    private EditText userName;
    private EditText password;
    private Button loginButton;
    private TextView info;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecomon_app_main);

        userName = (EditText)findViewById(R.id.editText);
        password =(EditText)findViewById(R.id.editText2);
        loginButton = (Button)findViewById(R.id.button);
        info = (TextView)findViewById(R.id.textView);

        info.setText("No of attempts remaining: 5");

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(userName.getText().toString(), password.getText().toString());
            }
        });
    }

    private void validate(String userName, String userPassword){
        if((userName.equals("abcd")) && (userPassword.equals("1234"))){
            //if the user enters correct login, a new activity will be loaded
            Intent intent = new Intent(EcomonAppMainActivity.this, SecondActivity.class);
            startActivity(intent);
        }else{
            counter--;

            info.setText("No of attempts remaining: " + String.valueOf(counter));

            if(counter == 0){
                loginButton.setEnabled(false);
            }
        }
    }

}
