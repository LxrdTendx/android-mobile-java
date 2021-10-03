package com.example.javaclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private int mValue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView valueTv = findViewById(R.id.value);
        TextView poltosTV = findViewById(R.id.poltos);

        findViewById(R.id.plus).setOnClickListener(v -> {
            mValue++;
            valueTv.setText(String.valueOf(mValue));
            if(mValue==0){
                poltosTV.setText("Вы нажали "+ mValue +" раз");
            }
            else if(mValue%100 == 12){
                poltosTV.setText("Вы нажали "+ mValue +" раз");
            }
            else if(mValue%100 == 13){
                poltosTV.setText("Вы нажали "+ mValue +" раз");
            }
            else if(mValue%100 == 14){
                poltosTV.setText("Вы нажали "+ mValue +" раз");
            }
            else if(mValue%10 == 2){
                poltosTV.setText("Вы нажали "+ mValue +" раза");
            }
            else if(mValue%10 == 3){
                poltosTV.setText("Вы нажали "+ mValue +" раза");
            }
            else if(mValue%10 == 4){
                poltosTV.setText("Вы нажали "+ mValue +" раза");
            }
            else poltosTV.setText("Вы нажали "+ mValue +" раз");

        });
        
        findViewById(R.id.minus).setOnClickListener(v -> {
            mValue--;
            valueTv.setText(String.valueOf(mValue));
            if(mValue==0){
                poltosTV.setText("Вы нажали "+ mValue +" раз");
            }
            else if(mValue%100 == 12){
                poltosTV.setText("Вы нажали "+ mValue +" раз");
            }
            else if(mValue%100 == 13){
                poltosTV.setText("Вы нажали "+ mValue +" раз");
            }
            else if(mValue%100 == 14){
                poltosTV.setText("Вы нажали "+ mValue +" раз");
            }
            else if(mValue%10 == 2){
                poltosTV.setText("Вы нажали "+ mValue +" раза");
            }
            else if(mValue%10 == 3){
                poltosTV.setText("Вы нажали "+ mValue +" раза");
            }
            else if(mValue%10 == 4){
                poltosTV.setText("Вы нажали "+ mValue +" раза");
            }
            else if(mValue%100 == -12){
                poltosTV.setText("Вы нажали "+ mValue +" раз");
            }
            else if(mValue%100 == -13){
                poltosTV.setText("Вы нажали "+ mValue +" раз");
            }
            else if(mValue%100 == -14){
                poltosTV.setText("Вы нажали "+ mValue +" раз");
            }
            else if(mValue%10 == -2){
                poltosTV.setText("Вы нажали "+ mValue +" раза");
            }
            else if(mValue%10 == -3){
                poltosTV.setText("Вы нажали "+ mValue +" раза");
            }
            else if(mValue%10 == -4){
                poltosTV.setText("Вы нажали "+ mValue +" раза");
            }
            else poltosTV.setText("Вы нажали "+ mValue +" раз");

        });
        findViewById(R.id.reset).setOnClickListener(v -> {
            int oldValue = mValue;
            mValue = 0;
            valueTv.setText(String.valueOf(mValue));
            poltosTV.setText("Вы нажали "+ mValue +" раз");
            Snackbar.make(v, "Counter was reset", Snackbar.LENGTH_SHORT)
                    .setAction("Отмена", ignored -> {
                        mValue = oldValue;
                        valueTv.setText(String.valueOf(mValue));
                        poltosTV.setText("Вы нажали "+ mValue +" раз(a)");
                    })

                    .show();
        });

    }
}