package com.example.rasdewyanti.hadiahprak10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etBil1 = (EditText) findViewById(R.id.bil1);
        final EditText etBil2 = (EditText) findViewById(R.id.bil2);
        final TextView tvHasil = (TextView) findViewById(R.id.hasil);
        Button btTambah = (Button) findViewById(R.id.tambah);
        Button btKurang = (Button) findViewById(R.id.kurang);

        btTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nBil1 = etBil1.getText().toString().trim();
                String nBil2 = etBil2.getText().toString().trim();

                double a = Double.parseDouble(nBil1);
                double b = Double.parseDouble(nBil2);

                double hasil= a+b;

                Bundle bundle = new Bundle();
                bundle.putString("hasil", Double.toString(hasil));
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        btKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nBil1 = etBil1.getText().toString().trim();
                String nBil2 = etBil2.getText().toString().trim();

                double a = Double.parseDouble(nBil1);
                double b = Double.parseDouble(nBil2);

                double hasil= a-b;

                Bundle bundle = new Bundle();
                bundle.putString("hasil", Double.toString(hasil));
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
