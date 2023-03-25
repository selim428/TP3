package com.example.tp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText mot;
    Button con;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mot = findViewById(R.id.mot);
        con = findViewById(R.id.con);

        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String password = mot.getText().toString();
                if (password.equals("123456")) {
                    Intent intent = new Intent(getApplicationContext(), suite.class);
                    startActivity(intent);
                }
            }
        });
    }
}