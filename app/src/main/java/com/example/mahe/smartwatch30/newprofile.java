package com.example.mahe.smartwatch30;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class newprofile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newprofile);
    }
    public void back(View view)
    {
        Intent s = new Intent(this,MainActivity.class);
        startActivity(s);
    }
}
