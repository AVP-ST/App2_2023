package com.example.app2_2023;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickPost_Login(View view)
    {
        Intent intent = new Intent(this,Post_Login_App.class);
        startActivity(intent);
    }
}