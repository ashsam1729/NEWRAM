package com.example.mahe.smartwatch30;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    public void back(View view)
    {
        Intent y = new Intent(this,MainActivity.class);
        startActivity(y);
    }

    public void password(View view)
    {
        Intent q = new Intent(this,password.class);
        startActivity(q);
    }
    public void settime(View view)
    {
        Intent l = new Intent(this,time.class);
        startActivity(l);
    }
    public void files(View view)
    {
        Intent m = new Intent(this,storedfiles.class);
        startActivity(m);
    }

}
