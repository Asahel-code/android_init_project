package com.example.fetch;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText value;
    Button ok,cancel;
    TextView results;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        value = findViewById(R.id.getScore);
        ok = findViewById(R.id.okButton);
        cancel = findViewById(R.id.cancelButton);
        results = findViewById(R.id.avarageResults);

        ok.setOnClickListener(view -> {
            double currentNumber = Double.parseDouble(value.getText().toString());

            results.setText(Double.toString((Double) currentNumber));
            value.setText("");
        });

        cancel.setOnClickListener(view -> value.setText(""));
    }
}