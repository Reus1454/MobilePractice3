package com.mirea.kopeykin.resultactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class DataActivity extends AppCompatActivity {
    private EditText universityEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        universityEditText = findViewById(R.id.universityEditText);
    }
    public void sendResultOnMainActivityOnClick(View view) {
        Intent intent = new Intent();
        intent.putExtra("name", universityEditText.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}