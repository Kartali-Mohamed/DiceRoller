package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Switch;

import java.lang.annotation.Annotation;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView img;
    private Random random;
    private Animation anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.ImgID);
        random = new Random();

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int i = random.nextInt(6)+1;

                anim = AnimationUtils.loadAnimation(MainActivity.this , R.anim.rotate);
                img.startAnimation(anim);

                switch(i){
                    case 1 : {
                        img.setImageResource(R.drawable.dice1);
                    } break;
                    case 2 : {
                        img.setImageResource(R.drawable.dice2);
                    } break;
                    case 3 : {
                        img.setImageResource(R.drawable.dice3);
                    } break;
                    case 4 : {
                        img.setImageResource(R.drawable.dice4);
                    } break;
                    case 5 : {
                        img.setImageResource(R.drawable.dice5);
                    } break;
                    case 6 : {
                        img.setImageResource(R.drawable.dice6);
                    } break;
                }
            }
        });
    }
}