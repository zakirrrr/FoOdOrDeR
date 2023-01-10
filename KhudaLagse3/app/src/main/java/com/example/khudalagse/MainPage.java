package com.example.khudalagse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainPage extends AppCompatActivity {
    Button back;
    String foodList[] = { "cheeseburger","hotdog","pizza","sandwich","milkshake" };
    int foodImages[] = {R.drawable.cheeseburger,R.drawable.hotdog,R.drawable.pizza,R.drawable.sandwich,R.drawable.milkshake};

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        listView=(ListView) findViewById(R.id.CustomFoodView);
        back=findViewById(R.id.bck);
        CustomeBaseAdapter customeBaseAdapter = new CustomeBaseAdapter(getApplicationContext(),foodList,foodImages);
        listView.setAdapter(customeBaseAdapter);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bckat= new Intent(MainPage.this,LoginPage.class);
                startActivity(bckat);
                finish();
            }
        });

        

    }
}