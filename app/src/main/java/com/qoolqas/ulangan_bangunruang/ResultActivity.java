package com.qoolqas.ulangan_bangunruang;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {
    public static final String HASIL = "hasil";
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        textView = findViewById(R.id.textview);
        String name = getIntent().getStringExtra(HASIL);
        textView.setText(name);
        Intent intent = getIntent();

        String result = intent.getStringExtra("data");
        TextView tv = findViewById(R.id.tvResult);
        tv.setText(result);

    }
}