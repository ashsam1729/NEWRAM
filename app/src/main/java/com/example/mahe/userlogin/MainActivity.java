package com.example.mahe.userlogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String str1,str2 ;

    public void READY2(View view)
    {
        EditText editText3 = (EditText)findViewById(R.id.editText3);
        str1 = editText3.getText().toString();
        EditText editText4 = (EditText)findViewById(R.id.editText4);
        str2 = editText4.getText().toString();
        if((str1.equals("newuser")==true)&&(str2.equals("1234")==true))
        {
            Intent p = new Intent(this,AFTERLOGIN.class);
            startActivity(p);
        }
        else
        {
            Toast.makeText(getApplicationContext(), "USERNAME OR PASSWORD IS WRONG",
                    Toast.LENGTH_SHORT).show();
        }


    }

    public void INPUT3(View view)
    {
        Intent i = new Intent(this,REGISTER.class);
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
