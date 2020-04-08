package com.example.tema3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FirstpageActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTimePickerActivity();
            }
        });

        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDatePickerActivity();
            }
        });

        button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //openTimePickerActivity();
            }
        });
    }
    public void openTimePickerActivity() {
        Intent intent = new Intent(this, TimePickerActivity.class);
        startActivity(intent);
    }
    public void openDatePickerActivity() {
        Intent intent = new Intent(this, DatePickerActivity.class);
        startActivity(intent);
    }
    //public void openTimePickerActivity() {
    //    Intent intent = new Intent(this, TimePickerActivity.class);
    //    startActivity(intent);
   // }
}
