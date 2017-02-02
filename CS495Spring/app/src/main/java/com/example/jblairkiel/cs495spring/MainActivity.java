package com.example.jblairkiel.cs495spring;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnLogin = (Button) findViewById(R.id.btnLogin);
        final EditText editText = (EditText) findViewById(R.id.editText);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String password = editText.getText().toString();

                if(password.equals("ou812")){
                    Toast.makeText(v.getContext(), "Open Sesame", Toast.LENGTH_SHORT).show();
                    Intent nextScreen = new Intent(v.getContext(), SecondScreen.class);
                    startActivity(nextScreen);
                }
                else{
                    Toast.makeText(v.getContext(), "Access Denied", Toast.LENGTH_SHORT).show();
                }

                editText.setText("");

            }
        });
    }
}
