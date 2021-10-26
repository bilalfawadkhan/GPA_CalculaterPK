package com.hunt4bit.gpacalculaterpk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        CardView fastButton = findViewById(R.id.fastBut);
        CardView bahriaButton = findViewById(R.id.bahriaBut);
        CardView custButton = findViewById(R.id.custBut);
        CardView furcButton = findViewById(R.id.furcBut);


        furcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoscreen(v,"FURC");
            }
        });
        fastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoscreen(v,"FAST");
            }
        });
        bahriaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoscreen(v,"BU");
            }
        });
        custButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoscreen(v,"CUST");
            }
        });
//
//

    }

    private boolean isClicked;
    public void gotoscreen(View view,String uniName){
        if(isClicked) {
            return;
        }
        isClicked = true;

        Intent intent = new Intent(this,popActivity.class);
        intent.putExtra("uniName", uniName);
        startActivity(intent);
        view.postDelayed(new Runnable() {

            @Override
            public void run() {
                isClicked = false;
            }
        }, 1000);

    }
}