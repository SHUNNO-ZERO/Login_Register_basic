package com.example.user.login_and_register;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity implements View.OnClickListener {


    Button bregister;
    EditText etname,etusername,etpassword,etage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etname=findViewById(R.id.etname);
        etusername=findViewById(R.id.etUsename);
        etpassword=findViewById(R.id.etPassword);
        etage=findViewById(R.id.etAge);
        bregister=findViewById(R.id.btRegister);


        bregister.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btRegister:
                break;



        }




    }
}
