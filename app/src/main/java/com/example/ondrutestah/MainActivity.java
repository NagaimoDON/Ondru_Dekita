package com.example.ondrutestah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button)findViewById(R.id.ondrubutton)).setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        if(view.getId() == R.id.ondrubutton){
            Intent intent = new Intent(this, OndruActivity.class);
            startActivity(intent);
        }
    }
}