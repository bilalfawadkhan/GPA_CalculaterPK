package com.hunt4bit.gpacalculaterpk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

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

        LinearLayout  furcButton = (LinearLayout) findViewById(R.id.furcBut);
        LinearLayout  fastButton = (LinearLayout) findViewById(R.id.fastBut);
        LinearLayout  bahriaButton = (LinearLayout) findViewById(R.id.bahriaBut);
        LinearLayout  custButton = (LinearLayout) findViewById(R.id.custBut);
        furcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoscreen(v,"FURc");
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
                gotoscreen(v,"BAHRIA");
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
        startActivity(intent);
        view.postDelayed(new Runnable() {

            @Override
            public void run() {
                isClicked = false;
            }
        }, 1000);

    }
}