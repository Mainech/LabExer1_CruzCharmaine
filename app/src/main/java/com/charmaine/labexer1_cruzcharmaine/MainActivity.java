package com.charmaine.labexer1_cruzcharmaine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void computeGrade(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        EditText quiz1 = (EditText) findViewById(R.id.quiz1Grade);
        EditText quiz2 = (EditText) findViewById(R.id.quiz2Grade);
        EditText swk = (EditText) findViewById(R.id.swkGrade);
        EditText lab = (EditText) findViewById(R.id.labGrade);
        EditText majorExam = (EditText) findViewById(R.id.majorGrade);
        String FG = "";

        float rawGrade = (float) (Float.parseFloat(quiz1.getText().toString()) * 0.1)
            + (float) (Float.parseFloat(quiz2.getText().toString()) * 0.1)
            + (float) (Float.parseFloat(swk.getText().toString()) * 0.1)
            + (float)(Float.parseFloat(lab.getText().toString()) * 0.4)
            + (float)(Float.parseFloat(majorExam.getText().toString()) * 0.3);

        if(rawGrade < 60)
            FG = "Failed";
        else if (rawGrade >= 60 && rawGrade <= 65)
            FG = "3.0";
        else if (rawGrade >= 66 && rawGrade <= 70)
            FG = "2.75";
        else if (rawGrade >= 71 && rawGrade <= 75)
            FG = "2.5";
        else if (rawGrade >= 76 && rawGrade <= 80)
            FG = "2.25";
        else if (rawGrade >= 81 && rawGrade <= 85)
            FG = "2.0";
        else if (rawGrade >= 86 && rawGrade <= 90)
            FG = "1.75";
        else if (rawGrade >= 91 && rawGrade <= 92)
            FG = "1.50";
        else if (rawGrade >= 93 && rawGrade <= 94)
            FG = "1.25";
        else if (rawGrade >= 95 && rawGrade <= 100)
            FG = "1.0";

        Bundle extras = new Bundle();
        extras.putString("rawGrade", String.valueOf(rawGrade));
        extras.putString("FG", FG);
        intent.putExtras(extras);
        startActivity(intent);
    }

}
