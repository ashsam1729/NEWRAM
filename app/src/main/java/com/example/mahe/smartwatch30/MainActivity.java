package com.example.mahe.smartwatch30;

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

    public void profile(View view)
    {
        Intent i = new Intent(this,newprofile.class);
        startActivity(i);
    }
    public void settings(View view)
    {
        Intent p = new Intent(this,settings.class);
        startActivity(p);
    }
    public void heartbeat(View view)
    {
        Intent k = new Intent(this,HEARTBEAT.class);
        startActivity(k);
    }
    public void location(View view)
    {
        Intent r = new Intent(this,location.class);
        startActivity(r);
    }
}
