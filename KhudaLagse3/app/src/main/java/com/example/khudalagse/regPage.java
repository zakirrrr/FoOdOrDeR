package com.example.khudalagse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class regPage extends AppCompatActivity {
    EditText username,password,repassword;
    Button signup,signin;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_page);
        username=findViewById(R.id.usname);
        password=findViewById(R.id.pd);
        repassword=findViewById(R.id.repd);
        signup=findViewById(R.id.submit);
        signin=findViewById(R.id.bck);
        DB = new DBHelper(this);

        signup.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String user = username.getText().toString();
                        String pass = password.getText().toString();
                        String repass = repassword.getText().toString();

                        if(user.equals("")||pass.equals("")||repass.equals(""))
                            Toast.makeText(regPage.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                        else{
                            if(pass.equals(repass)){
                                Boolean checkuser = DB.checkusername(user);
                                if(checkuser==false){
                                    Boolean insert = DB.insertData(user, pass);
                                    if(insert==true){
                                        Toast.makeText(regPage.this, "Registered successfully", Toast.LENGTH_SHORT).show();
                                        Intent intent = new Intent(getApplicationContext(),LoginPage.class);
                                        startActivity(intent);
                                    }else{
                                        Toast.makeText(regPage.this, "Registration failed", Toast.LENGTH_SHORT).show();
                                    }
                                }
                                else{
                                    Toast.makeText(regPage.this, "User already exists! please sign in", Toast.LENGTH_SHORT).show();
                                }
                            }else{
                                Toast.makeText(regPage.this, "Passwords not matching", Toast.LENGTH_SHORT).show();
                            }
                        } }
        });






        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bckactv= new Intent(regPage.this,LoginPage.class);
                startActivity(bckactv);
                finish();

            }
        });
    }
}