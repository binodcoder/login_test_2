package com.example.binod.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {


    public void loginFunction(View view){
        EditText userName=(EditText) findViewById(R.id.editText1);
        EditText password=(EditText) findViewById(R.id.editText2);

        Log.i("User Name",userName.getText().toString());
        Log.i("Password",password.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
