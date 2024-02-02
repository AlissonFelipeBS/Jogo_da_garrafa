package com.example.jogodagarrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView garrafa;
    private Random random = new Random();
    private int ultimaDirecao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        garrafa     = findViewById(R.id.Garrafa);
        garrafa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int novaDirecao = random.nextInt(1800);
                float eixoX = garrafa.getWidth() / 2;
                float eixoY = garrafa.getHeight() / 2;

                Animation girar = new RotateAnimation(ultimaDirecao, novaDirecao, eixoX, eixoY);
                girar.setDuration(3500);
                girar.setFillAfter(true);

                ultimaDirecao = novaDirecao;
                garrafa.startAnimation(girar);
            }
        });

    }
}