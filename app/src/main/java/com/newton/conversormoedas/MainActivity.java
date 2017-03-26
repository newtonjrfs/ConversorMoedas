package com.newton.conversormoedas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText valorReal;
    private TextView valorDolar,valorEuro;
    private Button botaoCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valorDolar = (TextView) findViewById(R.id.campoValorDolar);
        valorReal = (EditText) findViewById(R.id.campoValorReais);
        valorEuro = (TextView) findViewById(R.id.campoValorEuro);

        botaoCalcular = (Button) findViewById(R.id.botaoCalcular);

        botaoCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double vReal = Double.valueOf(valorReal.getText().toString());

                if (vReal == null){
                    Toast.makeText(MainActivity.this,R.string.valor_vazio,Toast.LENGTH_SHORT).show();
                }else
                {
                    valorDolar.setText(String.format("%.2f", vReal * 3.10));
                    valorEuro.setText(String.format("%.2f", vReal * 3.35));

                    valorReal.setText("");

                }
            }
        });


    }
}
