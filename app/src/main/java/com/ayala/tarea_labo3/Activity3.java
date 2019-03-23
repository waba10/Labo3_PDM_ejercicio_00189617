package com.ayala.tarea_labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.ayala.tarea_labo3.utils.AppConstant;

public class Activity3 extends AppCompatActivity {

    private TextView mTextFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        mTextFinal= findViewById(R.id.tv_final);

        Intent mIntent2= getIntent();
        if (mIntent2!=null) {
            mTextFinal.setText(mIntent2.getStringExtra(Intent.EXTRA_TEXT));

        }
    }
}
