package com.example.convodollar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button  = findViewById(R.id.button);
        textView  = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hello Welcome to my App", Toast.LENGTH_SHORT).show();
              String s =   editText.getText().toString();
              int inr = Integer.parseInt(s);
              double dollars = inr*0.014;
              textView.setText("The INR to Dollar is "+ dollars);
                

            }
        });

    }
}