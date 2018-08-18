package com.arya.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    textView=findViewById(R.id.text_view);
    Bundle bundle=getIntent().getExtras();
    int total=bundle.getInt("result");
    textView.setText("Total :"+total);
    }
}
