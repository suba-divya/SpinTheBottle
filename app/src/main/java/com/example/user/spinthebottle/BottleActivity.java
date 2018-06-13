package com.example.user.spinthebottle;

import android.graphics.drawable.RotateDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class BottleActivity extends AppCompatActivity {
    ImageView iv_bottle;
    Button b_go;
    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottle);
        r = new Random();
        iv_bottle = (ImageView) findViewById(R.id.iv_bottle);
        b_go = (Button) findViewById(R.id.b_go);
        b_go.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                RotateAnimation rotate = new RotateAnimation(0, r.nextInt(3600) + 360,
                        RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);
                rotate.setFillAfter(
                        true
                );
                rotate.setDuration(1000);
                rotate.setInterpolator(new AccelerateDecelerateInterpolator());
                iv_bottle.startAnimation(rotate);

            }
        });
    }
}
