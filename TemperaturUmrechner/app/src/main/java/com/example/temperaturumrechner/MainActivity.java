package com.example.temperaturumrechner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


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
        btn = (Button) findViewById(R.id.button);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    getCelsius();
                    celsiusTOkelvin();
                    celsiusTOfahrenheit();
                }
            catch(Exception ex) {
                Toast.makeText(getApplicationContext(), "Illegal Input", Toast.LENGTH_LONG).show();
            }
            }
        });
    }


    private void getCelsius() {
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