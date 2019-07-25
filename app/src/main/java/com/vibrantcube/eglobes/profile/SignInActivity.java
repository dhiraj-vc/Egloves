package com.vibrantcube.eglobes.profile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.vibrantcube.eglobes.R;

public class SignInActivity extends AppCompatActivity {

    TextView forgot_password_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);


        findViewById(R.id.imgBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

       forgot_password_tv = findViewById(R.id.forgot_password_tv);
        forgot_password_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forgotPasswordIntent = new Intent(SignInActivity.this, ForgotPasswordActivity.class);
                startActivity(forgotPasswordIntent);
                finish();
            }
        });



    }
}
