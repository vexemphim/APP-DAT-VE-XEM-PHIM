package com.congthuong.datvexemphim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class intr_spiderman extends AppCompatActivity {

    Button datve;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intr_spiderman);

        datve = (Button) findViewById(R.id.btdatve);
        datve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(intr_spiderman.this, trangchu.class);
                startActivity(intent);
            }
        });
    }
}
