package com.hunt4bit.gpacalculaterpk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
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

        //Getting Number of Labs and Courses from user input in popActivity
        Bundle courseExtras = getIntent().getExtras();
        String Courses = courseExtras.getString("courses");
        int thSubjects = Integer.parseInt(Courses);

        Bundle labExtras = getIntent().getExtras();
        String Labs = labExtras.getString("labs");
        int labSubjects = Integer.parseInt(Labs);

//        System.out.println("Courses="+Courses);
//        System.out.println("Labs="+Labs);


        createNew(thSubjects, labSubjects);

    }
    public void createNew(int courses, int labs){
        LinearLayout layout = (LinearLayout) findViewById(R.id.textLayout);
        LinearLayout crdLayout = (LinearLayout) findViewById(R.id.creditLayout);

//        TextView nothing= new TextView(subject_no_selection.this);
//        nothing.setText("");
//        nothing.setPadding(20, 30, 20, 20);
//        nothing.setTextSize(20);
//        nothing.setTextColor(Color.parseColor("#92D293"));

        //Courses
//        TextView coursesHeading= new TextView(subject_no_selection.this);
//        coursesHeading.setText("Theory Subjects");
//        coursesHeading.setPadding(20, 30, 20, 20);
//        coursesHeading.setTextSize(20);
//        coursesHeading.setTextColor(Color.parseColor("#92D293"));

        EditText etArrCourses [] = new EditText[courses];
        EditText crdHrArrCourses[] = new EditText[courses];
        for (int i = 0 ; i < etArrCourses.length;i++){ // loop for setting editText for marks  in linearLayout
            etArrCourses[i] = new EditText(subject_no_selection.this);
            crdHrArrCourses[i] = new EditText(subject_no_selection.this);
            etArrCourses[i].setPadding(20, 30, 20, 20);
            crdHrArrCourses[i].setPadding(10, 30, 10, 20);
            etArrCourses[i].setHint("Subject " + (i + 1));
            crdHrArrCourses[i].setHint("Credit Hr(s)");
        }
        if(etArrCourses.length != 0) {

//            layout.addView(coursesHeading);
//            crdLayout.setVisibility(View.INVISIBLE);
            for (int i = 0; i < etArrCourses.length; i++) {
                layout.addView(etArrCourses[i]);
                crdLayout.addView(crdHrArrCourses[i]);
            }
        }



        //Labs
//        TextView labsHeading= new TextView(subject_no_selection.this);
//
//        labsHeading.setText("Lab Subjects");
//        labsHeading.setPadding(20, 30, 20, 20);
//        labsHeading.setTextSize(20);
//        labsHeading.setTextColor(Color.parseColor("#92D293"));

        EditText etArrLabs [] = new EditText[labs];
        EditText crdHrArrLabs[] = new EditText[labs];
        for (int i = 0 ; i < etArrLabs.length;i++){ // loop for setting editText for marks  in linearLayout for labs
            etArrLabs[i] = new EditText(subject_no_selection.this);
            crdHrArrLabs[i] = new EditText(subject_no_selection.this);
            etArrLabs[i].setPadding(20, 30, 20, 20);
            crdHrArrLabs[i].setPadding(10, 30, 10, 20);
            etArrLabs[i].setHint("Lab " + (i + 1));
            crdHrArrLabs[i].setHint("Credit Hr(s)");
        }
        if(etArrLabs.length != 0 ) {
//            layout.addView(labsHeading);
//            crdLayout.setVisibility(View.INVISIBLE);
            for (int i = 0; i < etArrLabs.length; i++) {
                layout.addView(etArrLabs[i]);
                crdLayout.addView(crdHrArrLabs[i]);
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