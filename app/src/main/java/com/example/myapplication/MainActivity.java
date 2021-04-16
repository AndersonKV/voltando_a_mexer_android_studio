package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private EditText inputName;
    private TextInputEditText inputEmail;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputName = findViewById(R.id.name);
        inputEmail = findViewById(R.id.email);
        result = findViewById(R.id.result);

    }

    public void submit(View view) {

        String name = inputName.getText().toString();
        String email = inputEmail.getText().toString();

        result.setText("name: " + name + " email: " + email);
    }

    public void clear(View view) {
        inputName.setText("");
        inputEmail.setText("");
     }
}