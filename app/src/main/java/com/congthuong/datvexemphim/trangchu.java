package com.congthuong.datvexemphim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class trangchu extends AppCompatActivity {

    Button chonghe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trangchu);

        chonghe = (Button) findViewById(R.id.btchonghe);
        chonghe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(trangchu.this, ChonGhe.class);
                startActivity(intent);
            }
        });
    }
}
