package com.charmaine.labexer1_cruzcharmaine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String rawGrade = extras.getString("rawGrade");
        String FG = extras.getString("FG");

        EditText rg = (EditText) findViewById(R.id.editText);
        EditText fg = (EditText) findViewById(R.id.editText7);

        rg.setText(rawGrade);
        fg.setText((FG));

    }

    public void goBack(View view){
        finish();
    }
}
