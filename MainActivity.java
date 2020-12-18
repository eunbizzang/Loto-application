package com.example.loto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private Button newActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup=(RadioGroup)findViewById(R.id.lotoradio);
        newActivity =(Button) findViewById(R.id.newActivity);
        newActivity.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                RadioButton rd = (RadioButton)findViewById(radioGroup.getCheckedRadioButtonId());
                String radioresult = rd.getText().toString();
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("LOTOTYPE", radioresult);
                startActivity(intent);
            }
        });
    }
}
