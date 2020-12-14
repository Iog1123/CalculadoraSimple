package com.example.calculadorasimple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int resultado= calcular("");
        Log.d("resultado",String.valueOf(resultado));

         resultado=calcular("3");
        Log.d("resultado1",String.valueOf(resultado));

        resultado=calcular("3,5");
        Log.d("resultado2",String.valueOf(resultado));

        TextView txtresultado= findViewById(R.id.Resultado);
        txtresultado.setText("el resultado es:" + resultado);



    }

    public int calcular(String n1){

        if (n1.isEmpty()){
            return 0;
        }else if (n1.length()==3){
            String numArray[] = n1.split(",");
            int resultado=Integer.parseInt(numArray[0])+ Integer.parseInt(numArray[1]);
            return resultado;
        } else{
            return Integer.parseInt(n1);
        }
    }
}