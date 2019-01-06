package com.example.jigokushoujo.feliz2019;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface miFuente1 = Typeface.createFromAsset(getAssets(),"Bodie MF Holly.ttf");
        TextView dosmilDiecinueve = (TextView) findViewById(R.id.dosmil_diecinueve);
        dosmilDiecinueve.setTypeface(miFuente1);

        Animation animacion = AnimationUtils.loadAnimation(this,R.anim.animacion);
        TextView felizAnyo = (TextView) findViewById(R.id.feliz_anyo);
        felizAnyo.startAnimation(animacion);

        Animation animacion2 = AnimationUtils.loadAnimation(this,R.anim.animacion2);
        dosmilDiecinueve.startAnimation(animacion2);


        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.wewish);
        mediaPlayer.start();

    }
}
