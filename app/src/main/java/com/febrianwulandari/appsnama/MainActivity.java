package com.febrianwulandari.appsnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText input;
    Button tampilkan;
    TextView tampilan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (EditText)findViewById(R.id.input);
        tampilkan = (Button) findViewById(R.id.tampilkan);
        tampilan = (TextView) findViewById(R.id.tampilan);

    }

    public void tampilkan(View view) {
        String nama ;
        nama = input.getText().toString().trim();
        tampilan.setText(nama);
    }
}
