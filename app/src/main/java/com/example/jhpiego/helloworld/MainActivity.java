package com.example.jhpiego.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickSprinkles(View view) {

        CheckBox checkBox = (CheckBox) view;
        String message;

        if(checkBox.isChecked()){
            message="Gomawoyo sudah memilih Sprinkles";
        } else {
            message="Gomawoyo sudah tidak memilih Sprinkles";
        }

        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }

    public void clickCherrys(View view){

        CheckBox checkBox = (CheckBox) view;
        int mesej;

        if(checkBox.isChecked()){
            mesej=R.string.mesej;
        } else {
            mesej=R.string.no_mesej;
        }
        checkBox.setText(getString(mesej));

    }
}
