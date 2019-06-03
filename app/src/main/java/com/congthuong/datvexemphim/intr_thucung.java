package com.congthuong.datvexemphim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class intr_thucung extends AppCompatActivity {

    Button datve;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intr_thucung);

        datve = (Button) findViewById(R.id.btdatve);
        datve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(intr_thucung.this, trangchu.class);
                startActivity(intent);
            }
        });
    }
}
