package com.example.houlinjiang.baseandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.houlinjiang.baseandroid.service.TestServiceActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(this,TestServiceActivity.class));
    }


    public void testCrash(View view) {
        Activity activity = null;
        activity.finish();
    }
}
