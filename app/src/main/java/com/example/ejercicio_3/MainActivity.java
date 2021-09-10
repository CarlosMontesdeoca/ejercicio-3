package com.example.ejercicio_3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2, suma;
    Button sumabtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1Txt);
        num2 = (EditText) findViewById(R.id.num2Txt);
        suma = (EditText) findViewById(R.id.sumaTxt);
        sumabtn = (Button) findViewById(R.id.sumaBtn);
        sumabtn.setOnClickListener((View.OnClickListener) this);
    }

    public void onClick(View v){
        double val1 = Double.parseDouble(num1.getText().toString());
        double val2 = Double.parseDouble(num2.getText().toString());

        double add = val1 + val2;

        suma.setText( "" + add );
    }
}