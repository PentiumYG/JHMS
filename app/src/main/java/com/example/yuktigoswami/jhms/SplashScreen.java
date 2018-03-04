package com.example.yuktigoswami.jhms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {
    Button sub;
    ImageView ballon;
    Animation frombotton , fromtop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        sub= (Button)findViewById(R.id.sub);
        ballon = (ImageView)findViewById(R.id.ballon);

        frombotton= AnimationUtils.loadAnimation(this,R.anim.frombottom);
        fromtop = AnimationUtils.loadAnimation(this,R.anim.fromtop);

        sub.setAnimation(frombotton);
        ballon.setAnimation(fromtop);
        Thread th = new Thread(){
            public void run(){
                try{
                    sleep(5000);
                }
                catch (Exception h){}
                finally {
                    Intent i = new Intent(SplashScreen.this , UserInterface.class);
                    startActivity(i);
                    finish();

                }
            }
        };
        th.start();
    }
}