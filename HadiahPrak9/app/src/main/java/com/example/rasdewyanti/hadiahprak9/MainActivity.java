package com.example.rasdewyanti.hadiahprak9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtAlas, edtTinggi;
    private TextView txtVolume;
    private Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Hitung Volume Kerucut");

        edtAlas = (EditText) findViewById(R.id.alas);
        edtTinggi = (EditText) findViewById(R.id.tinggi);
        btnHitung = (Button) findViewById(R.id.hitung);
        txtVolume = (TextView) findViewById(R.id.volume);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String alas = edtAlas.getText().toString().trim();
                String tinggi = edtTinggi.getText().toString().trim();

                double a = Double.parseDouble(alas);
                double t = Double.parseDouble(tinggi);

                double volume = (1*a*t)/3;
                txtVolume.setText("Volume = " + volume);
            }
        });
    }
}
