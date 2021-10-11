package com.example.temperaturumrechner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etCelsius;
    private EditText etFahrenheit;
    private EditText etKelvin;
    private Button btn;
    private Float celsius;
    private Float kelvin;
    private Float fahrenheit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etCelsius = (EditText) findViewById(R.id.etCelsius);
        etFahrenheit = (EditText) findViewById(R.id.etFahrenheit);
        etKelvin = (EditText) findViewById(R.id.etKelvin);




        etCelsius.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                try {
                    getCelsius();
                } catch (Exception e) {

                }
            }
        });

    }


    private void getCelsius(){
        celsius = Float.parseFloat(String.valueOf(etCelsius.getText()));
    }

    private void celsiusTOkelvin(){
        kelvin = celsius + 273.15f;
        etKelvin.setText(String.valueOf(kelvin));

    }
    private void celsiusTOfahrenheit(){
        fahrenheit =  celsius * 1.8f + 32f;
        etFahrenheit.setText(String.valueOf(fahrenheit));
        // fahrenheit (celsius * 1.8 + 32)
    }
}