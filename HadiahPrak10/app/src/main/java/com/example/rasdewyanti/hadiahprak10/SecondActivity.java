package com.example.rasdewyanti.hadiahprak10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        TextView tvHasil = (TextView) findViewById(R.id.hasil);

        if (getIntent().getExtras()!=null) {
            Bundle bundle = getIntent().getExtras();
            tvHasil.setText(bundle.getString("hasil"));
        } else {
            tvHasil.setText(getIntent().getStringExtra("hasil"));
        }

    }
}
