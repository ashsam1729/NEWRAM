package com.example.mahe.smartwatch30;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class time extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
    }
    public void back(View view)
    {
        Intent z = new Intent(this,settings.class);
        startActivity(z);
    }
}
