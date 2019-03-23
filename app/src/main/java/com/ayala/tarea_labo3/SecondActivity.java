package com.ayala.tarea_labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.ayala.tarea_labo3.utils.AppConstant;

public class SecondActivity extends AppCompatActivity {

    private TextView mTextUser, mTextPass, mTextEmail, mTextGender;
    private Button mButtonShare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mButtonShare=findViewById(R.id.btn_share);
        mTextUser= findViewById(R.id.tv_user);
        mTextPass= findViewById(R.id.tv_pass);
        mTextEmail=findViewById(R.id.tv_email);
        mTextGender=findViewById(R.id.tv_genero);

        Intent mIntent= getIntent();
        if (mIntent!=null) {
            mTextUser.setText(mIntent.getStringExtra("key_user"));
            mTextPass.setText(mIntent.getStringExtra("key_pass"));
            mTextEmail.setText(mIntent.getStringExtra("key_email"));
            mTextGender.setText(mIntent.getStringExtra("key_genero"));
        }

        mButtonShare.setOnClickListener(v->{
            String text=mTextUser.getText().toString();
            String text1=mTextPass.getText().toString();
            String text2=mTextEmail.getText().toString();
            String text3=mTextGender.getText().toString();
            String text4= text+"\n" + text1+ "\n "+ text2+"\n "+text3;

            Intent mIntent2=new Intent();
            mIntent2.setType("text/plain");
            mIntent2.setAction(Intent.ACTION_SEND);
            mIntent2.putExtra(Intent.EXTRA_TEXT, text4);


            startActivity(mIntent2);
        });
    }




}
