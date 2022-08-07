package com.example.ondrutestah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OndruActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ondru);

        ((Button)findViewById(R.id.returningButton)).setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        if(view.getId() == R.id.returningButton){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}