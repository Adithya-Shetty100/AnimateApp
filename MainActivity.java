package com.example.animate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int first=0;
    public void fade(View view){

        ImageView arrow=(ImageView)findViewById(R.id.arrow);
        arrow.animate().scaleX(1).scaleY(1);

        ImageView flash=(ImageView)findViewById(R.id.flash);
        ImageView batman=(ImageView)findViewById(R.id.batman);

        ImageView tap=(ImageView)findViewById(R.id.tap);
        tap.animate().alpha(0).setDuration(1500).setStartDelay(50).start();

        if(first==0){
            arrow.animate().alpha(0).setDuration(3000);
            flash.animate().alpha(1).setDuration(4000);
            first=1;
        }

        else if (first==1){
            flash.animate().alpha(0).setDuration(3000);
            batman.animate().alpha(1).setDuration(4000);
            first=2;
        }

        else{
            batman.animate().alpha(0).setDuration(3000);
            arrow.animate().alpha(1).setDuration(4000);
            first=0;
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView arrow=(ImageView)findViewById(R.id.arrow);
        ImageView tap=(ImageView)findViewById(R.id.tap);

        arrow.setX(-1500);//to set initial co-ordinates when loaded
        //width constraints set to -2000
        arrow.animate().translationXBy(1500).scaleX(0.75f).scaleY(0.75f).rotation(4680f).alpha(0).setDuration(15000);
        tap.animate().alpha(1).setDuration(4000).setStartDelay(15000).start();

    }
}
