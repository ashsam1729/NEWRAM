package com.example.mahe.smartwatch30;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class location extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
    }
    public void back(View view)
    {
        Intent x = new Intent(this,MainActivity.class);
        startActivity(x);
    }
}
