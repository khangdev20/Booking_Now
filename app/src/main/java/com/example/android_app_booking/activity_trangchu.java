package com.example.android_app_booking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class activity_trangchu extends AppCompatActivity {
    ImageButton logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trangchu);

        logout = (ImageButton)findViewById(R.id.dangxuat);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dangxuat = new Intent(activity_trangchu.this,activity_logout.class);
                startActivity(dangxuat);
            }
        });
    }
}