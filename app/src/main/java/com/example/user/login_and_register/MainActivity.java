package com.example.user.login_and_register;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    Button blogout;
    EditText etname,etusername,etage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etname=findViewById(R.id.etname);
        etusername=findViewById(R.id.etUsename);
        etage=findViewById(R.id.etAge);
        blogout=findViewById(R.id.bLogout);


        blogout.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bLogout:
                startActivity(new Intent(this,Login.class));


                break;
        }






    }
}
