package com.ayala.tarea_labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.ayala.tarea_labo3.utils.AppConstant;

public class MainActivity extends AppCompatActivity {

    private EditText mUser, mPassword, mEmail, mGender;
    private Button mButtonSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUser=findViewById(R.id.et_user);
        mPassword=findViewById(R.id.et_pass);
        mEmail=findViewById(R.id.et_email);
        mGender=findViewById(R.id.et_genero);
        mButtonSubmit=findViewById(R.id.btn_submit);

        mButtonSubmit.setOnClickListener(v->{

            String usuario=mUser.getText().toString();
            String contraseña=mPassword.getText().toString();
            String correo= mEmail.getText().toString();
            String genero= mGender.getText().toString();
            Intent mIntent= new Intent(MainActivity.this, SecondActivity.class);
            mIntent.putExtra(AppConstant.Key_user, usuario);
            mIntent.putExtra(AppConstant.key_pass, contraseña);
            mIntent.putExtra(AppConstant.key_email, correo);
            mIntent.putExtra(AppConstant.key_genero, genero);
            startActivity(mIntent);
        });

    }
}
