package com.hunt4bit.gpacalculaterpk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class subject_no_selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_no_selection);
        createNew();

    }
    public void createNew(){
        LinearLayout layout = (LinearLayout) findViewById(R.id.textLayout);
        LinearLayout crdLayout = (LinearLayout) findViewById(R.id.creditLayout);

        EditText etArr [] = new EditText[6];
        EditText crdHrArr[] = new EditText[6];
        for (int i = 0 ; i < etArr.length;i++){ // loop for setting editText for marks  in linearLayout
            etArr[i] = new EditText(subject_no_selection.this);
            crdHrArr[i] = new EditText(subject_no_selection.this);
            etArr[i].setPadding(20, 30, 20, 20);
            crdHrArr[i].setPadding(10, 30, 10, 20);
            etArr[i].setHint("Subject" + (i + 1));
            crdHrArr[i].setHint("Credit Hr");


        }
        if(etArr.length != 0) {
            for (int i = 0; i < etArr.length; i++) {
                layout.addView(etArr[i]);
                crdLayout.addView(crdHrArr[i]);
            }
        }




    }

    public static int convertPixelsToDp(float px, Context context){
        Resources resources = context.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        float dp = px / (metrics.densityDpi / 160f) ;
        return (int) dp ;
    }

}