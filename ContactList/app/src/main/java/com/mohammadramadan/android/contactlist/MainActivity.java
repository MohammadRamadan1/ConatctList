package com.mohammadramadan.android.contactlist;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerButton();
        addListenerButton1();
        addListenerButton2();
        addListenerButton3();

    }
    public void addListenerButton (){
        final Context context = this;
        Button button = findViewById(R.id.familieButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, FamilieActivity.class);
                startActivity(intent);
            }
        });
    }
    public void addListenerButton1(){
        final Context context = this;
        Button button = findViewById(R.id.freundeButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(context,FreundeActivity.class);
                startActivity(intent);
            }
        });
    }
    public void addListenerButton2(){
        final Context context =this;
        Button button =findViewById(R.id.verwandteButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(context, VerwandteActivity.class);
                startActivity(intent);
            }
        });
    }
    public void addListenerButton3 (){
        final Context context = this;
        Button button = findViewById(R.id.arbeitsButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ArbeitsActivity.class);
                startActivity(intent);
            }
        });
    }


}
