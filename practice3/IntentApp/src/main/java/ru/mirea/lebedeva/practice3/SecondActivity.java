package ru.mirea.lebedeva.practice3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String text = (String) getIntent().getSerializableExtra("sendText");
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(text);
    }
}