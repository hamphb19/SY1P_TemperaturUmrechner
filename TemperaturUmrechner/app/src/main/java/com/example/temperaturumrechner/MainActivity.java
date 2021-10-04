package com.example.temperaturumrechner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etCelsius;
    private EditText etFahrenheit;
    private EditText etKelvin;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etCelsius = (EditText) findViewById(R.id.etCelsius);
        etFahrenheit = (EditText) findViewById(R.id.etFahrenheit);
        etKelvin = (EditText) findViewById(R.id.etKelvin);


    }
    private void getCelsius(){

    }

    private void celsiusTOkelvin(){

    }
    private void celsiusTOfahrenheit(){
        // print fahrenheit (celsius * 1.8 + 32)
    }
}