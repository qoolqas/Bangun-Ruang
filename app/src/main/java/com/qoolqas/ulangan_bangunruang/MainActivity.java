package com.qoolqas.ulangan_bangunruang;


import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText et_panjang, et_lebar, et_tinggi;
    private double p, l, t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_panjang = findViewById(R.id.etPanjang);
        et_lebar = findViewById(R.id.etLebar);
        et_tinggi = findViewById(R.id.etTinggi);

        Button btnkeliling = findViewById(R.id.btnKeliling);
        Button btnluas = findViewById(R.id.btnLuas);
        Button btnvolume = findViewById(R.id.btnVolume);

        btnkeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String panjang = et_panjang.getText().toString().trim();
                String lebar = et_lebar.getText().toString().trim();
                String tinggi = et_tinggi.getText().toString().trim();

                boolean isEmptyFields = false;

                if (TextUtils.isEmpty(panjang)) {
                    isEmptyFields = true;
                    et_panjang.setError("Field ini tidak boleh kosong");
                }
                if (TextUtils.isEmpty(lebar)) {
                    isEmptyFields = true;
                    et_lebar.setError("Field ini tidak boleh kosong");
                }
                if (TextUtils.isEmpty(tinggi)) {
                    isEmptyFields = true;
                    et_tinggi.setError("Field ini tidak boleh kosong");
                }
                if (!isEmptyFields) {
                    p = Double.parseDouble(panjang);
                    l = Double.parseDouble(lebar);
                    t = Double.parseDouble(tinggi);

                    Double keliling = 4 * (p + l + t);
                    Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                    intent.putExtra("data", String.valueOf(keliling));
                    intent.putExtra(ResultActivity.HASIL, "Keliling");

                    startActivity(intent);
                }
            }
        });
        btnluas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String panjang = et_panjang.getText().toString().trim();
                String lebar = et_lebar.getText().toString().trim();
                String tinggi = et_tinggi.getText().toString().trim();

                boolean isEmptyFields = false;

                if (TextUtils.isEmpty(panjang)) {
                    isEmptyFields = true;
                    et_panjang.setError("Field ini tidak boleh kosong");
                }
                if (TextUtils.isEmpty(lebar)) {
                    isEmptyFields = true;
                    et_lebar.setError("Field ini tidak boleh kosong");
                }
                if (TextUtils.isEmpty(tinggi)) {
                    isEmptyFields = true;
                    et_tinggi.setError("Field ini tidak boleh kosong");
                }
                if (!isEmptyFields) {
                    p = Double.parseDouble(panjang);
                    l = Double.parseDouble(lebar);
                    t = Double.parseDouble(tinggi);

                    Double luas = 2 * ((p * l) + (p * t) + (l * t));
                    Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                    intent.putExtra("data", String.valueOf(luas));
                    intent.putExtra(ResultActivity.HASIL, "Luas");

                    startActivity(intent);
                }
            }
        });
        btnvolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String panjang = et_panjang.getText().toString().trim();
                String lebar = et_lebar.getText().toString().trim();
                String tinggi = et_tinggi.getText().toString().trim();

                boolean isEmptyFields = false;

                if (TextUtils.isEmpty(panjang)) {
                    isEmptyFields = true;
                    et_panjang.setError("Field ini tidak boleh kosong");
                }
                if (TextUtils.isEmpty(lebar)) {
                    isEmptyFields = true;
                    et_lebar.setError("Field ini tidak boleh kosong");
                }
                if (TextUtils.isEmpty(tinggi)) {
                    isEmptyFields = true;
                    et_tinggi.setError("Field ini tidak boleh kosong");
                }
                if (!isEmptyFields) {
                    p = Double.parseDouble(panjang);
                    l = Double.parseDouble(lebar);
                    t = Double.parseDouble(tinggi);

                    Double volume = (p * l * t);
                    Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                    intent.putExtra("data", String.valueOf(volume));
                    intent.putExtra(ResultActivity.HASIL, "Volume");
                    startActivity(intent);
                }
            }
        });
    }

}
