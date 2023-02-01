package com.thenameless.bilkent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void goToSrs(View view){
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);
    }
    public void goToMail(View view){
        Intent intent = new Intent(MainActivity.this,MainActivity3.class);
        startActivity(intent);
    }
    public void goToSche(View view){
        Intent intent = new Intent(MainActivity.this,MainActivity4.class);
        startActivity(intent);
    }
    public void goToMenu(View view){
        Intent intent = new Intent(MainActivity.this,MainActivity5.class);
        startActivity(intent);
    }
}