package com.example.image;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
private int counter = 1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotR(View view) {
        ImageView imageView = null;
        if ((counter==5)){
            imageView.setImageResource(R.drawable.steve);
            counter=1;
        }
        else{
            if (counter==4){
                imageView.setImageResource(R.drawable.squshii);
                counter++;

            }
            else{
                if (counter==3){
                    imageView.setImageResource(R.drawable.kslan);
                    counter++;
                }
                else{
                    if (counter==2){
                        imageView.setImageResource(R.drawable.konds);
                        counter++;
                    }
                    else{
                        if (counter==1){
                            imageView.setImageResource(R.drawable.fokma);
                            counter++;
                        }
                    }


                }
            }}}
    public void gotL(View view) {
        ImageView imageView = null;
        if (counter==1){
            imageView.setImageResource(R.drawable.fokma);
            counter=5;
        }
        else{
            if (counter==2){
                imageView.setImageResource(R.drawable.konds);
                counter--;

            }
            else{
                if (counter==3){
                    imageView.setImageResource(R.drawable.kslan);
                    counter--;
                }
                else{
                    if (counter==4){
                        imageView.setImageResource(R.drawable.squshii);
                        counter--;
                    }
                    else{
                        if (counter==5){
                            imageView.setImageResource(R.drawable.steve);
                            counter--;
                        }
                    }
                }
            }}
    }}