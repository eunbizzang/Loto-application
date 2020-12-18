package com.example.loto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String result = intent.getStringExtra("LOTOTYPE");

        lotonumber loto;
        loto = new lotonumber();

        if (result.equals("ロト６")) {
            loto.number1 = 43;
            loto.number2 = 6;
        } else if(result.equals("ロト７")) {
            loto.number1 = 37;
            loto.number2 = 7;
        } else if(result.equals("ミニロト")) {
            loto.number1 = 31;
            loto.number2 = 5;
        } else {
            loto.number1 = 0;
            loto.number2 = 0;
        }
        TextView tv1 = findViewById(R.id.tv1);
        tv1.setText(lotonumber.num());

        Button button2=findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                finish();
            }
        });
    }
}
