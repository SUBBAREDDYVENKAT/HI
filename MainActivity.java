package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
      EditText editText;
      TextView textView;
      Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        editText=(EditText) findViewById ( R.id.editText );
        textView=(TextView) findViewById ( R.id.textView );
    }
    public void fun(View v){
        textView.setText ( "Hello "+editText.getText () );
    }
}