package com.hunt4bit.gpacalculaterpk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.TextView;

public class popActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);
        TextView heading= findViewById(R.id.textView6);
        Button nextBut = findViewById(R.id.NextBut);

        EditText NOfcourses = findViewById(R.id.NocTextF);
        EditText NOfLabs = findViewById(R.id.NolTextF);





        //Setting title of the popup window
        Intent intent =getIntent();
        String uniName= intent.getStringExtra("uniName");
        heading.setText(uniName.toUpperCase());


        //Sending the number of courses and labs to subject_no_selection class
        //to generate the number of subjects and labs accordingly


        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);


        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width *.8),(int) (height*.4));
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));


        nextBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intents =new Intent(popActivity.this, subject_no_selection.class);


                Bundle courseExtras= new Bundle();
                courseExtras.putString("courses", NOfcourses.getText().toString());

                Bundle labExtras= new Bundle();
                labExtras.putString("labs", NOfLabs.getText().toString());


                intents.putExtras(courseExtras);
                intents.putExtras(labExtras);
                startActivity(intents);

            }
        });
    }
}