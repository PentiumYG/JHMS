package com.example.yuktigoswami.jhms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserInterface extends AppCompatActivity {
    Button S,H,C;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_interface);

        S = (Button)findViewById(R.id.students);
        H = (Button)findViewById(R.id.hostlers);
        C = (Button)findViewById(R.id.college);

        S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(UserInterface.this, LoginPage.class);
                startActivity(intent);
            }
        });

        H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(UserInterface.this, LoginPage.class);
                startActivity(i);
            }
        });

        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j= new Intent(UserInterface.this, College.class);
                startActivity(j);
            }
        });

    }
}
