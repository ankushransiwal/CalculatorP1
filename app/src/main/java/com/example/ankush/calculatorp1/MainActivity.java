package com.example.ankush.calculatorp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etNumber;
    Button btnCube,btnSquare,btnSquareRoot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumber = (EditText)findViewById(R.id.etNumber);
        btnCube = (Button)findViewById(R.id.btnCube);
        btnSquare = (Button)findViewById(R.id.btnSquare);
        btnSquareRoot = (Button)findViewById(R.id.btnSquareRoot);

        btnSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double number = Double.parseDouble(etNumber.getText().toString());
                double square = number * number;
                Toast.makeText(MainActivity.this, "Square of " +number+" is: " + square, Toast.LENGTH_SHORT).show();
            }
        });


        btnSquareRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double number = Double.parseDouble(etNumber.getText().toString());
                double squareRoot = Math.sqrt(number);
                Toast.makeText(MainActivity.this, "Square root of "+number+" is: "+squareRoot, Toast.LENGTH_SHORT).show();
            }
        });

        btnCube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double number = Double.parseDouble(etNumber.getText().toString());
                double cube = number * number * number;
                Toast.makeText(MainActivity.this, "Cube of "+number+" is: "+cube, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
