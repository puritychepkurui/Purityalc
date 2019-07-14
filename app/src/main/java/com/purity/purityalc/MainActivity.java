package com.purity.purityalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button andela = (Button) findViewById(R.id.andela);
        andela.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent numbersIntent = new Intent( MainActivity.this, Andela.class);
                startActivity(numbersIntent);}});

        Button profile = (Button) findViewById(R.id.profile);
        profile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent familyIntent = new Intent( MainActivity.this, Profile.class);
                startActivity(familyIntent);}});
    }
}
