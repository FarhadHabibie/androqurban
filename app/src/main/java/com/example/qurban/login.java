package com.example.qurban;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.BindView;
import android.view.View ;




import butterknife.ButterKnife;


public class login extends AppCompatActivity {

private static final String TAG ="loginactivity";
    private static final int REQUEST_SIGNUP = 0;

    @BindView(R.id.link_signup) TextView _signuplink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        _signuplink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),signup.class);
                startActivityForResult(intent, REQUEST_SIGNUP);
            }
        });


    }
    }



