package com.arya.myfirstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText1;

    private EditText editText2;

    private Button addButton;
    private static final String TAG= MainActivity.class.getName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.edit_text1);
        editText2 = findViewById(R.id.edit_text2);
        addButton = findViewById(R.id.add_button);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = editText1.getText().toString();
                String value2 = editText2.getText().toString();

                if (TextUtils.isEmpty(value1) || TextUtils.isEmpty(value2)) {
                    Toast.makeText(getApplicationContext(), "can't be empty", Toast.LENGTH_SHORT).show();
                } else {
                    int val1 = Integer.parseInt(value1);
                    int val2 = Integer.parseInt(value2);
                    int total = val1 + val2;
                    Toast.makeText(getApplicationContext(), "result"+total, Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(MainActivity.this,HomeActivity.class);
                    i.putExtra("result",total);
                    startActivity(i);
                }
            }
        });
    }
}


