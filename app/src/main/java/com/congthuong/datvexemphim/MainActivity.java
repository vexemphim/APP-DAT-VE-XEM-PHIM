package com.congthuong.datvexemphim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

Button getbtnaladdin;
    Button getbtdoraemon;
    Button getpokemon;
    Button getspiderman;
    Button getgodzilla;
    Button getthucung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getbtnaladdin = (Button) findViewById(R.id.btaladdin);
        getbtnaladdin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, intrudu_aladin.class);
                startActivity(intent);
            }
        });

        getthucung = (Button) findViewById(R.id.btthucung);
        getthucung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, intr_thucung.class);
                startActivity(intent);
            }
        });

        getbtdoraemon = (Button) findViewById(R.id.btdoraemon);
        getbtdoraemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, intr_doraemon.class);
                startActivity(intent);
            }
        });

        getgodzilla = (Button) findViewById(R.id.btgodzilla);
        getgodzilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, intr_gozilla.class);
                startActivity(intent);
            }
        });

        getpokemon = (Button) findViewById(R.id.btpokemon);
        getpokemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, intr_POkemon.class);
                startActivity(intent);
            }
        });

        getspiderman = (Button) findViewById(R.id.btspiderman);
        getspiderman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, intr_spiderman.class);
                startActivity(intent);
            }
        });
    }
}
