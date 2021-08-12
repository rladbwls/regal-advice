package com.example.yujin.legaladvice;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick1(View V)
    {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.kr/maps"));
        startActivity(myIntent);
    }

    public void onClick4(View V)
    {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.law.go.kr/DRF/lawSearch.do?OC=test&target=elaw&type=HTML"));
        startActivity(myIntent);
    }
}
