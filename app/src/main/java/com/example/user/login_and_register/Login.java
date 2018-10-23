package com.example.user.login_and_register;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity implements View.OnClickListener {

    Button blogin;
    EditText etusername,etpassword;
    TextView tvRegisterlink;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etusername=findViewById(R.id.etUsename);
        etpassword=findViewById(R.id.etPassword);
        blogin=findViewById(R.id.bLoggin);
        tvRegisterlink=findViewById(R.id.tvRegisterlink);

        blogin.setOnClickListener(this);
        tvRegisterlink.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.bLoggin:
                break;


            case R.id.tvRegisterlink:

                 startActivity(new Intent(this,Register.class));

                break;






        }

    }
}





















