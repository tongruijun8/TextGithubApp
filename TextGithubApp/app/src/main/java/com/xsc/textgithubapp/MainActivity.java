package com.xsc.textgithubapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    private Untils untils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        untils = new Untils();
        initView();

    }

    private void initView() {

        textView = (TextView) findViewById(R.id.textView);
        textView.setText(untils.getVault());
    }
}
