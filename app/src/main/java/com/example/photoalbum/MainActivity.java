package com.example.photoalbum;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    Button btnPrev,btnNext;
    ImageView display;

    char[] ch= {'a','b','c','d','e'};
    int index=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPrev= findViewById(R.id.btnPrev);
        btnNext=findViewById(R.id.btnNext);
        display=findViewById(R.id.display);

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index--;
                if(index<0)
                {
                    index=index+5;
                }
                index= index%5;
                String uri = "@drawable/"+ch[index];
                int imageResource = getResources().getIdentifier(uri, null, getPackageName());
                display.setImageResource(imageResource);




            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index++;
                index=index%5;

                String uri = "@drawable/"+ch[index];
                int imageResource = getResources().getIdentifier(uri, null, getPackageName());
                display.setImageResource(imageResource);
            }
        });
    }
}