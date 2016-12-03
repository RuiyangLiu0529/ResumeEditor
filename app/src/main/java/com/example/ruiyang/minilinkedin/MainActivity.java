package com.example.ruiyang.minilinkedin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


import com.example.ruiyang.minilinkedin.models.BasicInfo;
import com.example.ruiyang.minilinkedin.models.Education;
import com.example.ruiyang.minilinkedin.models.Experience;
import com.example.ruiyang.minilinkedin.models.Project;
import com.example.ruiyang.minilinkedin.util.DateUtils;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private BasicInfo basicInfo;
    private Experience experience;
    private Project project;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fakeData();
        setupUI();
    }

    private void setupUI() {
        ((TextView)findViewById(R.id.name)).setText(basicInfo.name);
        ((TextView)findViewById(R.id.email)).setText(basicInfo.email);

    }

    public void fakeData() {
        basicInfo = new BasicInfo();
        basicInfo.name = "Ruiyang Liu";
        basicInfo.email = "liu.5230@osu.edu";

        Education education = new Education();
        education.school = "The Ohio State University";
        education.major = "Electrical Computer Engineering";
        education.startDate = DateUtils.stringToDate("08/2015");
        education.endDate = DateUtils.stringToDate("05/2017");

        education.courses = new ArrayList<>();
        education.courses.add("DataBase");
        education.courses.add("Algorithm");
        education.courses.add("OO Design");

       /*
        Education education2 = new Education();
        education2.school = "Harbin Insititute Of Technology";
        education2.major = "Electronic Engineering";
        education2.startDate = DateUtils.stringToDate("08/2011");
        education2.endDate = DateUtils.stringToDate("07/2015");

        education2.courses = new ArrayList<>();
        education2.courses.add("Image Processing");
        education2.courses.add("Data Structure");
        education2.courses.add("C Programing Language");
        */


        experience = new Experience();



    }
}
