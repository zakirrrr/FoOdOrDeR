package com.example.khudalagse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class thirdPage extends AppCompatActivity {
private Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_page);
        btn1= findViewById(R.id.next2);
        btn2=findViewById(R.id.skip2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(thirdPage.this,fourthPage.class);
                startActivity(intent2);
                finish();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(thirdPage.this,LoginPage.class);
                startActivity(intent1);
                finish();
            }
        });
    }
}